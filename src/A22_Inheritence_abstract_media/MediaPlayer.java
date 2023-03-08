package A22_Inheritence_abstract_media;

public abstract class MediaPlayer {
    protected String maker;
    protected int volume;
    protected boolean connectivity;
    protected String fileFormat;

    public MediaPlayer(String maker, boolean connectivity) {
        this.maker = maker;
        this.volume = 5;
        this.connectivity = connectivity;
        this.fileFormat = "Wave";
    }

    public String getMaker() {
        return this.maker;
    }

    public void setVolume(int volume) {
        if (volume > 0 && volume <= 10) {
            this.volume = volume;
        }

    }

    public boolean isConnectivity() {
        return this.connectivity;
    }

    public abstract void play();

    public void volumeUp() {
        if (this.volume < 10) {
            ++this.volume;
        }

        System.out.println(this.volume);
    }

    public void volumeDown() {
        if (this.volume > 0) {
            --this.volume;
        }

        System.out.println(this.volume);
    }
}
