package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven today? ");
        int miles = input.nextInt();

        System.out.println("How much gas (in gallons) have you put into the gastank? ");
        int gallons = input.nextInt();

        int milesPerGallon = miles / gallons;
        System.out.println("Ok, great! \n You drove " + milesPerGallon + " miles per gallon on your trip!");

    }
}
