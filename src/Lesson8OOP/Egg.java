package Lesson8OOP;

import java.util.ArrayList;

/**
 * Created by Артем on 27.09.2016.
 */
public class Egg {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Egg egg = new Egg();
        Egg egg1 = new Egg();
        list.add(egg);
        list.add(egg1);
        int size = list.size();
        System.out.println(size);
        boolean isIn = list.contains(egg);
        System.out.println(isIn);
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);
        list.remove(egg);
        int index = list.indexOf(egg1);
        System.out.println(index);
    }
}
