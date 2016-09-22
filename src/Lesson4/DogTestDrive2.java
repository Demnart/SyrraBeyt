package Lesson4;

/**
 * Created by Артем on 22.09.2016.
 */
public class DogTestDrive2 {
    public static void main(String[] args) {
        Dog1[] dogs = new Dog1[5];// Создаем массив собак, для хранения в этом массиве обьектов.(Чтото вроде стойла или загона)

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog1();
            dogs[i].bark();
        }

    }

}
