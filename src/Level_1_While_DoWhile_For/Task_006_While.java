package Level_1_While_DoWhile_For;

import java.util.Scanner;

public class Task_006_While {

    // Показываем, что получаем;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("enough")) {
                break;
            } else {
                System.out.println(string);
            }
        }
    }
}

