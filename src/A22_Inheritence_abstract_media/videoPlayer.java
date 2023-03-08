package A22_Inheritence_abstract_media;

public class videoPlayer extends MediaPlayer {
    private int brightness;

    videoPlayer(String maker, boolean connectivity) {
        super(maker, connectivity);
    }

    public void lowBrightness() {
        if (this.brightness >= 0) {
            --this.brightness;
        }

        System.out.println(this.brightness);
    }

    public void highBrightness() {
        if (this.brightness <= 10) {
            ++this.brightness;
        }

        System.out.println(this.brightness);
    }

    public void play() {
        System.out.println(this.getClass().getSimpleName() + "is Playing a file");
    }
}
