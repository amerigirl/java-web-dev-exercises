package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {
    //three fields: 1. student final grade
                 // 2. hashmap of student names and final grades (how the hell do we fill this? 4 loop through arrayLists? (but then you have to make the array list)
                  //3. assignments completed??

    private Character Finalgrade;

    public Character getFinalgrade() {
        return Finalgrade;
    }

    public void setFinalgrade(char aFinalGrade) {
    Finalgrade = aFinalGrade;
    }


    private HashMap<String, Character> FinalGradePrintout = new HashMap<>();
    //how to add names and grades to this---.put with a .get method?


    //add to the hashmap and make a loop to iterate through--right?



}
