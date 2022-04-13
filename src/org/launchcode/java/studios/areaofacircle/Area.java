package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.println("Can you tell me the radius of the circle you want to use?");
        double radius = input.nextDouble();
        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.println("Based on the radius provided, the area of your " +
                "circle is " + area);
        input.close();

    }
}
