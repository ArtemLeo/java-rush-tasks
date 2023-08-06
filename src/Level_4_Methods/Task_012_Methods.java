package Level_4_Methods;

// У всего есть корень;

public class Task_012_Methods {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }


    public static void printSqrt(int[] array) {
        String elementSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double mathSqrt = Math.sqrt(element);
            System.out.println(elementSqrt + element + " = " + mathSqrt);
        }
    }
}

