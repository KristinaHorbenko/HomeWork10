package Ex1;
import java.util.ArrayList;

public class StringOccurrenceCounter {
    public static int countOccurrence(ArrayList<String> stringList, String targetString) {
        int count = 0;
        for (String str : stringList) {
            if (str.equals(targetString)) {
                count++;
            }
        }
        return count;
    }
}

