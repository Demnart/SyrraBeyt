package Lesson5;

/**
 * Created by Артем on 23.09.2016.
 */
public class TimeTestDrive {
    public static void main(String[] args) {
        Time time = new Time();
        time.setTime("12:15");
        System.out.println("Время на часах : " + time.getTime());
    }
}
