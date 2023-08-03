package Level_2_Array;

// Заполняем массив;

import java.util.Arrays;

public class Task_016_Array {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 15;

    public static void main(String[] args) {
        int firstPart;
        if (array.length % 2 == 0) {
            firstPart = array.length / 2;
        } else {
            firstPart = array.length / 2 + 1;
        }
        Arrays.fill(array, 0, firstPart, valueStart);
        Arrays.fill(array, firstPart, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
