package Lesson2;

/**
 * Created by Артем on 21.09.2016.
 */
public class TapeDeckTest1 {
    public static void main(String[] args) {

        TapeDeck1 tapeDeck = new TapeDeck1();

        tapeDeck.canRecord = true;
        tapeDeck.playType();

        if ( tapeDeck.canRecord == true) {
            tapeDeck.recordType();
        }
    }
}
