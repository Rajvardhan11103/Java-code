/*  Problem 2: Media Player
Description: Create an interface MediaPlayer to represent different types of media players.
Requirements:
1. Create an interface MediaPlayer with methods play(), pause(), and stop().
2. Implement this interface in classes AudioPlayer and VideoPlayer.
3. Each class should provide its own implementation of the play(), pause(), and stop() methods.
4. Implement a main method to create instances of each player type and demonstrate playing, 
pausing, and stopping media. */ 
 
interface MediaPlayer {
    void play();
    void pause();
    void stop();
}

 
class AudioPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing audio...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio...");
    }
}

 
class VideoPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing video...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing video...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping video...");
    }
}

  class MediaPlayerDemo {
    public static void main(String[] args) {
         
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaPlayer videoPlayer = new VideoPlayer();

         
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();

       
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
    }
}
