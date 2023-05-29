package Ex4_1;

import java.util.ArrayList;

import static Ex4_1.List.findOccurance;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("bird");
        words.add("fox");
        words.add("cat");
        words.add("bird");
        words.add("fox");
        words.add("bird");
        words.add("bird");
        words.add("cat");

       ArrayList<Occurance> occurrenceList = findOccurance(words);

        for (Occurance occurrence : occurrenceList) {
            System.out.println("Name: " + occurrence.getName() + ", occurrence: " + occurrence.getOccurrence());

        }
    }
 }

