package Level_4_Methods;

// Анализ массивов;

public class Task_011_Methods {
    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.print("В массиве: ");
        printArray(array);
        System.out.println("Минимальное значение = " + getMinValue(array));
        System.out.println("Максимальное значение = " + getMaxValue(array));

    }

    private static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }


    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

