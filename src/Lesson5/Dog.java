package Lesson5;

/**
 * Created by Артем on 23.09.2016.
 */
public class Dog {
    int size;

    void bark(){
        if (size > 70) { // У нас имееться один метод на все обьекты, однако как он будет выполнен и что будет выведено на эран зависит от того какое значение будет передано в переменную size
            System.out.println("RRRRGav");
        } else if (size > 30 && size < 70) {
            System.out.println("Gav");
        } else if (size < 30) {
            System.out.println("Teaf-teaf");
        }

    }
}
