package Ex2;

import java.util.ArrayList;

public class ArrayToListConverter {
    public static ArrayList<Integer> toList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }
}

