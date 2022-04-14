package exercises;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String Seuss = "I would not, could not, in a box.  I would not, could not with a fox.  I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrOfStr = Seuss.split(" ");
        System.out.println(Arrays.toString(arrOfStr));
    }
}
