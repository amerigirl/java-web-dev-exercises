package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;


public class MyTry {
    public static void main(String[] args) {
        ArrayList<Integer> mainNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        System.out.println(mainNumbers);

        ArrayList<Integer> secondList = new ArrayList<>();
        for (Integer value : mainNumbers) {
            secondList.add(value);
            System.out.println(secondList);



        }
    }

        //--not so good version--ArrayList<Integer> secondList = new ArrayList<>(mainNumbers.remove())



//  // adding element to the second ArrayList
//        // by iterating over one by one


//        for (int i = 0; i < mainNumbers.size(); i++) {
//            System.out.println(mainNumbers.get(i));



    }



//i want to take what's in mainNumbers and put them in secondList



