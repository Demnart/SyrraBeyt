package Lesson2;

/**
 * Created by Артем on 21.09.2016.
 */
public class DrumKitTest {
    public static void main(String[] args) {
        DrumKit drumKit = new DrumKit();

        if (drumKit.snare == true) {
            drumKit.playSnare();
        }

        drumKit.playTopHat();
    }
}
