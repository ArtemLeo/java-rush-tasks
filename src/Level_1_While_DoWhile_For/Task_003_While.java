package Level_1_While_DoWhile_For;

import java.util.Scanner;

public class Task_003_While {

    // Суммирование;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;

        while (!isExit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            } else if (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                if (string.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);
    }
}

