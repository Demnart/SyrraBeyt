package Lesson9AbstractInterface;

/**
 * Created by Артем on 29.09.2016.
 email adress: insidia93@gmail.com;
 */
public abstract class Animal {
    String food;
    int hunger;
    int boundary;
    int location;


    void eat(){}
    void sleep(){}
    void roam(){}
  abstract void makeNoice();// Данный метод должен быть переопределен у конкретных потомков, в обязательном порядке!!!!
}
