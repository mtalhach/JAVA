package A22_Inheritence_abstract_media;

public class AudioPlayer extends MediaPlayer {
    AudioPlayer(String maker, boolean connectivity) {
        super(maker, connectivity);
        this.fileFormat = "Wave";
    }

    public void play() {
        System.out.println(this.getClass().getSimpleName() + "Is playing a file");
    }
}

