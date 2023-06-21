package Level_1_While_DoWhile_For;

import java.util.Scanner;

// Площадь круга;

public class Task_015_Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        double p = 3.14;
        int square;
        if (radius > 0) {
            square = (int) (p * radius * radius);
            System.out.println(square);
        }
    }
}

