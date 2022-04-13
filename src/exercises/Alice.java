package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String firstSentence = "     Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, \n and of having nothing " +
                "to do: once or twice she had peeped into the book her \n sister " +
                "was reading, but it had no pictures or conversations in it," +
                " 'and what is \n the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";

    System.out.println("Here is the first sentence from Alice's Adventures in Wonderland: " +
            "\n \n" + firstSentence + "\n \n I know this sounds silly, but is there a particular " +
            "word you'd like me to search for \n in this sentence?");

//why is "Alice" returning false if everything is .toLowercase?
    String perfectWord = input.nextLine().toLowerCase();

    System.out.println("Guess what? It's " + firstSentence.contains(perfectWord)+ " that " + perfectWord +
            " is in the first sentence of Alice's Adventures in Wonderland!  " +
            "\n Here is a bit more info about your word: \n \n Here's the index of your word: " + firstSentence.indexOf(perfectWord) + "," +
     "\n and, here's how long your word is: " + perfectWord.length() +
    "\n \n Wanna do some more silly stuff?  Of course you do!  Let's reprint our sentence, BUT let's" +
            " take your word out!  \n Look closely at the sentence below.  Do you see your word in the sentence below?");
    String secondSentence = firstSentence.replace(perfectWord, "");

    System.out.println("\n" + secondSentence);

    }

}
