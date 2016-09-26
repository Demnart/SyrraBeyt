package Lesson7OOp;

/**
 * Created by Артем on 23.09.2016.
 */
public class SimpleDotCom {
    private int[] cells;// Обьявляем целочисленный массив не инициализируя его
    int numOfHits = 0;// Обьявляем переменную хранящую количество ходов

    public void setCells(int[] cells) {//передаем массив через точку входа в программу
        this.cells = cells;
    }

    public String chekyourSelf(String userGuess) {// метод принимающий строковое значение
        int guess = Integer.parseInt(userGuess);// Преобразование типов String в int
        String result = "Mimo";//Создаем переменную результат для хранения в нем результа метода
        for (int cell : cells) {// пробегаемся по каждому элементу массива cells
            if (guess == cell) {// Проверяем одинаковы ли значения которые передал нам пользователь со значениями хранящимися в массие
                result = "Popal";// Если значения равны изменяем переменную result
                numOfHits++;//инкрементируем попадания
                break;
            }
        }
        if (numOfHits == cells.length) {// Проверяем: равно ли количество попаданий длине массива и если да
            result = "Потопил";// То изменяем result
        }
        System.out.println(result);// Выводим на экран наш результат
        return result;

    }
}
