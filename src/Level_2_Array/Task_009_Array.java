package Level_2_Array;

// Таблица умножения;

public class Task_009_Array {

    public static int[][] MULTIPLICATION_TABLE = new int[10][10];

    public static void main(String[] args) {
        for (int i = 1; i <= MULTIPLICATION_TABLE.length; i++) {
            for (int j = 1; j <= MULTIPLICATION_TABLE.length; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i - 1][j - 1]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
