package Ex3;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumberFinder {
    public static   List<Integer> findUnique(List<Integer> numbers) {
        Set<Integer> uniqueSet = new HashSet<>(numbers);
        return new ArrayList<>(uniqueSet);
    }
}

