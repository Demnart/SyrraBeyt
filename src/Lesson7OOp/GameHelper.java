package Lesson7OOp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Артем on 26.09.2016.
 */
public class GameHelper {
    public String getUserInput(){
        String inputLine = null;// Создаем переменную которая будет хранить введенные значения
        System.out.println("Введите ваше число");// Выводим на экран полученный параметр в метод
        try {// Пытаемся чтото сделать
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));// BufferedReader - класс в java позволяющий получать пользователький ввод с клавиатуры
            inputLine = is.readLine();// Сохраняем полученный результат в нашу переменную
            if (inputLine.length() == 0) { // если пользователь ничего не ввел
                return null;// Возвращаем значение null
            }
        }catch(IOException e){// Исключения до этого еще ох как далеко
                System.out.println("IOException : " + e);
            }
            return inputLine;// возвращаем значение полученное с клавиатуры
        }

    }

