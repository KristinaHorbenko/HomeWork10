package Ex3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 42, 1, 5, 37, 6, 41, 23, 13, 9);

        List<Integer> uniqueNumbers = UniqueNumberFinder.findUnique(numbers);

        System.out.println("Original numbers: " + numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}

