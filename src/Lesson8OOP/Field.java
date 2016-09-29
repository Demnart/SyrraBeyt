package Lesson8OOP;

import java.util.ArrayList;

/**
 * Created by Артем on 27.09.2016.
 */
public class Field {
    private ArrayList<String> locationCells;
    private String name;

    public Field(String name) {
        this.name = name;
    }

    public Field(ArrayList<String> locationCells) {

        this.locationCells = locationCells;
    }

    public String checkYourSelf(String userInput) {
        String result = "Mimo";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Potopil";
            } else {
                result = "Popal";
            }
        }
        return result;
    }
}
