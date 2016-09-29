package Lesson8OOPExtends;

/**
 * Created by Артем on 29.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.eat();
        wolf.makeNoice();
        wolf.roam();
        wolf.sleep();

        Cat cat = new Cat();
        cat.eat();
        cat.makeNoice();
        cat.roam();
        cat.sleep();

        //Принцип полиморфизма позволяет нам создать массив родителького класса и в нем создать обьекты дочернего класса,чтобы в будущем использовать все их методы
        Animal[] animals = new Animal[5];
        animals[0] = new Lion();
        animals[1] = new Dog();
        animals[2] = new Wolf();
        animals[3] = new Cat();
        animals[4] = new Hippo();

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }

    }

}
