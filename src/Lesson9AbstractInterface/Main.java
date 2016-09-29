package Lesson9AbstractInterface;

import java.util.ArrayList;

/**
 * Created by Артем on 29.09.2016.
 email adress: insidia93@gmail.com;
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(0,new Cat());
        animals.add(1, new Dog());
        animals.add(2, new Lion());
        animals.add(3, new Wolf());

        for (Animal animal : animals) {
            animal.makeNoice();
        }
        System.out.println("Наши домашние питомцы:\n ");
        System.out.println("Кошки");
        Cat cat = new Cat();
        cat.beFriendly();
        cat.devoted();
        System.out.println();
        Dog dog = new Dog();
        System.out.println("Собаки\n");
        dog.beFriendly();
        dog.devoted();
    }

}
