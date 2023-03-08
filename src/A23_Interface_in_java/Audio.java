package A23_Interface_in_java;

import A22_Inheritence_abstract_media.MediaPlayer;

public class Audio extends MediaPlayer implements Electronic_interfarence {
    Audio(String maker, boolean connectivity) {
        super(maker, connectivity);
    }

    public void play() {
    }

    public void turnOff() {
    }

    public void turnOn() {
    }
}
