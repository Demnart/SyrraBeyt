package Lesson9AbstractInterface;

/**
 * Created by Артем on 29.09.2016.
 */
public class Dog extends Cannie implements HomePets {


    void eat(){}
    void makeNoice(){
        System.out.println("Собака гавкает");
    }

    @Override
    public void beFriendly() {
        System.out.println("Хозяин я тебя люблю");
    }

    @Override
    public void devoted() {
        System.out.println("Хозяяяин я тебя так ждал");
    }
}
