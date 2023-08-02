package Level_2_Array;

// Создаем двумерный массив;

import java.util.Arrays;
import java.util.Scanner;

public class Task_011_Array {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];

        for (int i = 0; i < N; i++) {
            int size = scanner.nextInt();
            multiArray[i] = new int[size];
        }

        for (int[] value : multiArray) {
            System.out.println(Arrays.toString(value));
        }
    }
}
