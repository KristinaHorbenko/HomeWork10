package Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7};

        ArrayList<Integer> list = ArrayToListConverter.toList(array);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("List: " + list);
    }
}

