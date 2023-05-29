package Ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Occurance {
    public static void calcOccurance (ArrayList<String> words) {
        Map<String, Integer> occurrenceMap = new HashMap<>();

        for (String word : words) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
