package Level_1_While_DoWhile_For;

import java.util.Scanner;

public class Task_002_While {

    // Все любят Мамбу;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count = 1;
        while (count <= 10) {
            System.out.println(count + " " + name + " любит меня.");
            count++;
        }
    }
}

