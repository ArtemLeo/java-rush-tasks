package Level_2_Array;

// Максимальное из N чисел;

import java.util.Scanner;

public class Task_007_Array {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
