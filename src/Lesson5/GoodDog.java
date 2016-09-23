package Lesson5;

/**
 * Created by Артем on 23.09.2016.
 */
public class GoodDog {
    private int size;//Принцип инкапсуляции, защишай свои переменные так чтобы не возможно было изменить их напрямую через оператор
    // доступа точка(.). Делай все свои переменные приватными для того чтобы защитить свой класс.

    public void setSize(int size) {// Специальный метод позволяющий установить в переменную класса значения при условии что он помечен
        //как приватная.
        if (size > 10) {
            this.size = size;
        } else {
            System.out.println("Введите значение больше 10");
        }

    }

    void bark() {
        if (size > 70) { // У нас имееться один метод на все обьекты, однако как он будет выполнен и что будет выведено на эран зависит от того какое значение будет передано в переменную size
            System.out.println("RRRRGav");
        } else if (size > 30 && size < 70) {
            System.out.println("Gav");
        } else if (size < 30) {
            System.out.println("Teaf-teaf");
        }
    }

        void bark(int numbersOfBark){// Данный метод получает в себя параметры
            while (numbersOfBark > 0) {
                System.out.println("GAV");
                numbersOfBark--;
            }

    }

    }

