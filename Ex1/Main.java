package Ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("apple");
        stringList.add("plum");
        stringList.add("apple");
        stringList.add("plum");
        stringList.add("grape");
        stringList.add("grape");

        String targetString = "apple";

        int occurrenceCount = StringOccurrenceCounter.countOccurrence(stringList, targetString);
        System.out.println("Quantity" + targetString + "\": " + occurrenceCount);
    }
}

