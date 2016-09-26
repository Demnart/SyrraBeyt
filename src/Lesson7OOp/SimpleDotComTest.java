package Lesson7OOp;

/**
 * Created by Артем on 23.09.2016.
 */
public class SimpleDotComTest {
    public static void main(String[] args) {
        int numberOfGuest = 0;// Создаем переменную выстрелов
        GameHelper gameHelper = new GameHelper();// Создаем экземпляр класса(Обьект)GameHelper
        SimpleDotCom simpleDotCom = new SimpleDotCom();//Создаем экземпляр класса
        int randomNum = (int) (Math.random() * 5);// С помощью библиотеки Math генерируем рендомное число от 0 до 4
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};// устанавливаем наш сайт на следующие позиции
        simpleDotCom.setCells(locations);// Передаем наш массив в виде аргумента методу setCells
        boolean isAlive = true;// Создаем булеву переменную и присваеваем ей значение true

        while (isAlive == true) {// Главный игровой цикл который будет работать до тех пор пока переменная isAlive равна true
            String guess = gameHelper.getUserInput();//Получяем пользовательский ввод с клавиатуры
            String result = simpleDotCom.chekyourSelf(guess);//передаем пользовательский ввод методу chekyourSelf
            numberOfGuest++;// инкрементируем выстрелы

            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numberOfGuest + " " + "попыток(ки)");
            }

        }

    }
}
