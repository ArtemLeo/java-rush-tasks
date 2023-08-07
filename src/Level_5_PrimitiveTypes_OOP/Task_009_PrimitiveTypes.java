package Level_5_PrimitiveTypes_OOP;

// Массив значений;

import java.util.Arrays;

public class Task_009_PrimitiveTypes {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}

