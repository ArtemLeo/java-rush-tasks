package Level_1_While_DoWhile_For;

import java.util.Scanner;

// Поделитесь колой (Share a Coke);

public class Task_016_Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cola = scanner.nextInt();
        int people = scanner.nextInt();

        double result = cola * 1.0 / people;
        System.out.println(result);
    }
}

