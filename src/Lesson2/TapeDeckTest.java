package Lesson2;

/**
 * Created by Артем on 21.09.2016.
 */
public class TapeDeckTest {
    public static void main(String[] args) {

        TapeDeck tapeDeck = new TapeDeck();

        tapeDeck.canRecord = true;
        tapeDeck.playType();

        if ( tapeDeck.canRecord == true) {
            tapeDeck.recordType();
        }
    }
}
