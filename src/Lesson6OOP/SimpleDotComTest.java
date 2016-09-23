package Lesson6OOP;

/**
 * Created by Артем on 23.09.2016.
 */
public class SimpleDotComTest {
    public static void main(String[] args) {
        SimpleDotCom simpleDotCom = new SimpleDotCom();// Создаем новый обьект
        int[] c = {1,2,3};// Создаем целочисленный массив и инициализируем его
        simpleDotCom.setCells(c);// Передаем инициализированный массив методу
        String result = simpleDotCom.chekyourSelf("1");// Передаем методу строковый аргумент и сохранем возвращенное значение в переменную result
        System.out.println(result);
    }
}
