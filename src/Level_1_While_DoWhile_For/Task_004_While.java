package Level_1_While_DoWhile_For;

public class Task_004_While {

    // Заполненный прямоугольник;

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int j = 1;
            while (j < 10) {
                System.out.print("Q");
                j++;
            }
            System.out.println("Q");
            i++;
        }
    }
}


