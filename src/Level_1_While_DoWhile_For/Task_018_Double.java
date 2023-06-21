package Level_1_While_DoWhile_For;

import java.util.Scanner;

// Стакан наполовину пуст или наполовину полон?;

public class Task_018_Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double glass = 0.5;
        boolean optimist = scanner.nextBoolean();

        if (optimist) {
            glass = Math.ceil(glass);
        } else {
            glass = Math.floor(glass);
        }
        System.out.println("Glass of water = " + glass + " liter");
    }
}
