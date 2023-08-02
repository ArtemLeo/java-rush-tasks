package Level_2_Array;

// Треугольный массив;

public class Task_010_Array {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }
}
