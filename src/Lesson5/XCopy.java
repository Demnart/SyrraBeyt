package Lesson5;

/**
 * Created by Артем on 23.09.2016.
 */
public class XCopy {
    public static void main(String[] args) {
        int x = 15;
        XCopy xCopy = new XCopy();
        int y = xCopy.go(x);
        System.out.println(x + " " + y);
    }


    private int go(int x) {
        x = x * 2;
        return x;
    }
}
