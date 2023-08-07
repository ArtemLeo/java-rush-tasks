package Level_5_PrimitiveTypes_OOP;

// Гибкое заполнение массива;

import java.util.Arrays;

public class Task_010_PrimitiveTypes {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        for (int i = begin; i < end; i++) {
            array[i] = value;
        }
    }
}

