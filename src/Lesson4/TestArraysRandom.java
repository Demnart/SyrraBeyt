package Lesson4;

import java.util.Random;

/**
 * Created by Артем on 22.09.2016.
 */
public class TestArraysRandom {
    public static void main(String[] args) {
        int[] index = new int[4];//Создаем массив целочисленных чисел(без запятой), хранящий в себе 4 ячейки
        String[] islands = new String[4];//Создаем массив строк,хранящий в себе 4 ячейки
            int ref = 0;
            int y = 0;
        //TODO Придумать как воплотить этот код с рандомом
        for (int i = 0; i < index.length; i++) {
            Random random = new Random();
            index[i] = 0 + random.nextInt(3);
            ref = index[i];
        }


        islands[0] = "Bermuds"; //инициализация массива
        islands[1] = "Fidji";
        islands[2] = "Azors islands";
        islands[3] = "Kosumeli";

        while (y < 4) {//цикл который будет повторяться до тех пор пока у не будет больше 4
            System.out.print("Islands = ");// выводим на экран фразу
            System.out.println(islands[ref]);//выводим на экран строковые значения, но по тому порядку, по которому передает значение перменная ref
            y++;//
        }
    }
}
