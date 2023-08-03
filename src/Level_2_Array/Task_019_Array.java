package Level_2_Array;

// Есть ли кто? (binarySearch);

import java.util.Arrays;

public class Task_019_Array {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] copyArr = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArr);
        int index = Arrays.binarySearch(copyArr, element);
        System.out.println(index >= 0);
    }
}


