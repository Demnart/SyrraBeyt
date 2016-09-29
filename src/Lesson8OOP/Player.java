package Lesson8OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Артем on 27.09.2016.
 */
public class Player {
    private static final String alphabet = "abcdefg";
        private int greedLenght = 7;
        private int greedSize = 49;
    private int[] grid = new int[greedSize];
    private int comCount = 0;

    public String getUserInput() {
        String inputLine = null;
        System.out.println("Введит ваши координаты");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            inputLine = bufferedReader.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException o ) {
            System.out.println("IOException " + o);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphaCoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attemps = 0;
        boolean succes = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1) {
            incr = greedLenght;
        }
        while (!succes & attemps++ < 200) {
            location = (int) (Math.random() * greedSize);
            int x = 0;
            succes = true;
            while (succes && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= greedSize) {
                        succes = false;
                    }
                    if (x > 0 && (location % greedLenght == 0)) {
                        succes = false;
                    }
                } else {
                    System.out.println("используеться" + location);
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;
        while (x < comSize) {
            grid[coords[x]] = 1;
            row = (int) (coords[x] / greedLenght);
            column = coords[x] % greedLenght;
            temp = String.valueOf(alphabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }

        return alphaCells;
    }
}
