package Lesson6;

import java.util.AbstractCollection;
import java.util.Arrays;

/**
 * Created by Артем on 22.09.2016.
 */
public class Dog {
    int size;
    int age;
    String name;

    Dog[] dog = new Dog[5];// Обьявляем массив типа дог и устанавливаем его количество 5-ю ячейками

    void setDog() {
        for (int i = 0; i < dog.length; i++) {// Пробегаемся по массиву собак
            dog[i] = new Dog();// Каждому итому элементу присваиваем новую собаку
            dog[i].age = 0; // так как мы прсвоили каждому элементу массива ссылку на обьект, каждому новому элементу ссылку на новый обьект , мы можем установить в поля класса значения такие как возраст, размер и имя!
        }
    }
        void show(){
        for (Dog dog1 : dog) {
            System.out.printf("Возраст собаки %d\n",dog1.age);
        }
    }

}

