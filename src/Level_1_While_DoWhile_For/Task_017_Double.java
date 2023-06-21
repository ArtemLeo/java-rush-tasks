package Level_1_While_DoWhile_For;

import java.util.Scanner;

// Скорость ветра;

public class Task_017_Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedMS = scanner.nextInt();

        double speedKMH = speedMS * 3.6;
        int result = (int) Math.round(speedKMH);
        System.out.println(result);
        System.out.println(speedKMH);
    }
}


