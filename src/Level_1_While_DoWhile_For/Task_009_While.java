package Level_1_While_DoWhile_For;

import java.util.Scanner;

// Максимум из введенных чисел;

public class Task_009_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (max < x && x % 2 == 0) {
                max = x;
            }
        }
        System.out.println(max);
    }
}

