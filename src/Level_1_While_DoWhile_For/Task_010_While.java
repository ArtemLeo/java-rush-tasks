package Level_1_While_DoWhile_For;

import java.util.Scanner;

// Второе минимальное число из введенных;

public class Task_010_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int secondMin = scanner.nextInt();

        if (min > secondMin) {
            int temp = min;
            min = secondMin;
            secondMin = temp;
        }
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (min == secondMin) {
                if (x < min) {
                    min = x;
                } else {
                    secondMin = x;
                }
            } else if (x < min) {
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) {
                secondMin = x;
            }
        }
        System.out.println("-------------");
        System.out.println("SecondMin = " + secondMin);
    }
}