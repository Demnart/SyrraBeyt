package Lesson7OOp;

/**
 * Created by Артем on 26.09.2016.
 */
public class Multifor {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            if (i == 1) {
                i++;
            }
            for (int j = 4; j > 2; j--) {
                System.out.println(i + " " + j);
            }

        }
    }
}
