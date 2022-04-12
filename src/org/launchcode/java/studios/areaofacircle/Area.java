package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Can you give me a radius for how big you'd like your circle to be? ");
double radius = input.nextDouble();
        double pi = 3.14;
        double area = Circle.getArea(radius);
        System.out.println("Great!  The area of your circle is " + area);
        input.close();
    }
}
