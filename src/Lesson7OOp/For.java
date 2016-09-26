package Lesson7OOp;

/**
 * Created by Артем on 26.09.2016.
 */
public class For {
    public static void main(String[] args) {
        For mimi  = new For();
        mimi.go();
    }

    void go() {
        int y = 7;
        for (int i = 1; i < 8; i++) {
            y++;
            if (i > 4) {
                System.out.println(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x = " + i);
                break;
            }
        }

    }
}

