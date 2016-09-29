package Lesson8OOPExtends;

/**
 * Created by Артем on 29.09.2016.
 */
public class Main1 {
    public static void main(String[] args) {

        Vet vet = new Vet();
        Dog dog = new Dog();
        Hippo hippo = new Hippo();
        vet.getShoot(dog);
        vet.getShoot(hippo);
        }

    }


