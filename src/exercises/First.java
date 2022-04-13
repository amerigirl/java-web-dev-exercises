package exercises;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle: ");

        int rectangleLength = input.nextInt();

         System.out.println("What is the width of your rectangle: ");

         int rectangleWidth = input.nextInt();
         int areaOfRectangle = rectangleLength * rectangleWidth;
         System.out.println("The area of your rectangle is " + areaOfRectangle);
    }
}
