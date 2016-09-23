package Lesson5;

/**
 * Created by Артем on 23.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        GetSet getSet = new GetSet();
        System.out.println("целочисленное значение равно: " + getSet.getAge());//Переменные методов всегда хранят значение для примитивов 0, для ссылок на обьект null

        System.out.println("Строковое значение равно: " + getSet.getName());//Переменные методов всегда хранят значение для примитивов 0, для ссылок на обьект null

    }
}
