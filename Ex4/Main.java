package Ex4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList<>();
        words.add("bird");
        words.add("fox");
        words.add("cat");
        words.add("bird");
        words.add("fox");
        words.add("bird");
        words.add("bird");
        words.add("cat");

        Occurance.calcOccurance(words);


        }
    }

