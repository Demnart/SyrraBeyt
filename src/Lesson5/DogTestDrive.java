package Lesson5;

/**
 * Created by Артем on 23.09.2016.
 */
public class DogTestDrive {
    public static void main(String[] args) {
        // У нас создано 3 обьекта и каждому передано разное значение размера, из-за этого вывод на экран будет разным

        Dog dog = new Dog();
        dog.size = 80;
        dog.bark();
        Dog dog1 = new Dog();
        dog1.size = 50;
        dog1.bark();
        Dog dog2 = new Dog();
        dog2.size = 15;
        dog2.bark();

    }
}
