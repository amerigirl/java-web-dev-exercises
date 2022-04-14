package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> mainList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
     for(int i = 0; i < 11; i++){
         if ( i % 2 == 0) {
             System.out.println(i + "");
         }
     }

     ArrayList<String> stringList = new ArrayList<String>();
     stringList.add("Happy");
     stringList.add("Love");
     stringList.add("Fills");
     stringList.add("Enjoys");
     stringList.add("supply");

    for (int i = 0; i < stringList.size(); i++) {
        System.out.println(stringList.get(i));
    }

Scanner input = new Scanner(System.in);
        System.out.println("Can you tell me what length of a word you'd like to search? You can choose 4, 5, or 6. " +
                "So, what's your choice going to be? ");
    }
}
