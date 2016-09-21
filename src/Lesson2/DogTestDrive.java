package Lesson2;

/**
 * Created by Артем on 21.09.2016.
 */
public class DogTestDrive { // Главный метод из которого мы запускаем программу

    public static void main(String[] args) {//Точка входа в программу, с нее начинаеться выполнение любой программы написанной на Java
        int x = 0;
        Dog dog = new Dog(); // Создаем новый обьект(Собаку), с помощью оператора new
        while (x < 5) {
            dog.bark();// Вызов метода лаять из класса Dog
            x++;
        }
        dog.bark();// Вызов метода лаять из класса Dog

    }
}
