package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        System.out.println(planets);


        for(int i = 0; i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }
    }
}
    
