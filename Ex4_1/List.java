package Ex4_1;

import java.util.ArrayList;

public class List {
    public static ArrayList<Occurance> findOccurance(ArrayList<String> wordList) {
        ArrayList<Occurance> occurrenceList = new ArrayList<>();

        for (String word : wordList) {
            boolean found = false;
            for (Occurance occurrence : occurrenceList) {
                if (occurrence.getName().equals(word)) {
                    occurrence.setOccurrence(occurrence.getOccurrence() + 1);
                    found = true;
                    break;
                }
            }
            if (!found) {
                occurrenceList.add(new Occurance(word, 1));
            }
        }
        return occurrenceList;
    }
}









