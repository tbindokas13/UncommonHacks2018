package sttTest;

import voce.SpeechRecognizer;

public class Backend {

	public static void main(String[] args) 
	{
		voce.SpeechInterface.init("C:\\Users\\tbind\\Desktop\\Java Application\\sttTest\\Recources\\Libraries\\lib", false, true, 
				"C:\\Users\\tbind\\Desktop\\Java Application\\sttTest\\Recources\\Libraries\\lib", "");

		//voce.SpeechRecognizer sp = new SpeechRecognizer("C:\\Users\\tbind\\Desktop\\Java Application\\sttTest\\Recources\\Libraries\\lib","C:\\Users\\tbind\\Desktop\\Java Application\\sttTest\\Recources\\Libraries\\lib", "");
			
		
		
		boolean quit = false;
			while (!quit)
			{
				// Normally, applications would do application-specific things 
				// here.  For this sample, we'll just sleep for a little bit.
				try
				{
					Thread.sleep(200);
				}
				catch (InterruptedException e)
				{
					
				}

				while (voce.SpeechInterface.getRecognizerQueueSize() > 0)
				{
					String s = voce.SpeechInterface.popRecognizedString();

					// Check if the string contains 'quit'.
					if (-1 != s.indexOf("quit"))
					{
						quit = true;
					}

					System.out.println("You said: " + s);
					//voce.SpeechInterface.synthesize(s);
				}
			}

			voce.SpeechInterface.destroy();
			System.exit(0);
	}

}
