package Level_1_While_DoWhile_For;

import java.util.Scanner;

// Минимум из введённых чисел;

public class Task_008_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = true;
        int number = Integer.MAX_VALUE;

        while (isExit) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if (i < number) {
                    number = i;
                }
            } else {
                isExit = false;
            }
        }
        System.out.println("-----------");
        System.out.println("Min number = " + number);
    }
}
