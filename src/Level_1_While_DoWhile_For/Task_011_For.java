package Level_1_While_DoWhile_For;

// Четные числа;

public class Task_011_For {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("-----------");

        for (int i = 0; i <= 15; i = i + 2) {
            System.out.println(i);
        }
    }
}

