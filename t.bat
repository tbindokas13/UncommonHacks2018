c:\

move /-y "C:\Users\Zaid\Downloads\MP4ScreenRecorder-master\MP4ScreenRecorder-master\mp4Result\video.mp4" "c:\Users\Zaid\Desktop\Scroll\ffmpeg\bin\video.mp4"

cd c:\Users\Zaid\Desktop\Scroll\ffmpeg\bin
ffmpeg -i video.mp4 -i audio.wav -c:v copy -c:a aac -strict experimental output.mp4

move /-y "c:\Users\Zaid\Desktop\Scroll\ffmpeg\bin\output.mp4" "c:\Users\Zaid\Desktop\Scroll\Lectures\file_%time:~0,2%%time:~3,2%%time:~6,2%_%date:~-10,2%%date:~-7,2%%date:~-4,4%.mp4"
del video.mp4
del audio.wav


