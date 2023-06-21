package Level_1_While_DoWhile_For;

import java.util.Scanner;

public class Task_012_For {

// Сумма кратных чисел (1;30;3);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

