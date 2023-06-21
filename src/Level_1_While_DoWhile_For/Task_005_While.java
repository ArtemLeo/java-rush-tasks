package Level_1_While_DoWhile_For;

public class Task_005_While {

    // Незаполненный прямоугольник;

    public static void main(String[] args) {
        int height = 1;
        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print("Q");
                } else if (width == 1 || width == 20) {
                    System.out.print("Q");
                } else {
                    System.out.print(" ");
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}

