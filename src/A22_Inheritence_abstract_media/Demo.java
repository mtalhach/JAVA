package A22_Inheritence_abstract_media;

public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer("Toyota", true);
        videoPlayer videoPlayer = new videoPlayer("Tesla", true);
        audioPlayer.play();
        videoPlayer.play();
        audioPlayer.volumeDown();
        videoPlayer.highBrightness();
    }

}
