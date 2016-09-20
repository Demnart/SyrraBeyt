package Lesson1;

/**
 * Created by Артем on 20.09.2016.
 */
public class DooBeeDo {
    public static void main(String[] args) {
        int x = 1;

        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x++;
        }
        if (x == 3) {
            System.out.println("Do");
        }
        System.out.println("Finish!");
    }
}
