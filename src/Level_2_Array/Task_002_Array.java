package Level_2_Array;

// Четные и нечетные ячейки массива;

public class Task_002_Array {
    public static void main(String[] args) {
        String[] strings = new String[5];
        String even = "Чётное число";
        String odd = "Нечётное число";

        strings[0] = even;
        strings[1] = odd;
        strings[2] = even;
        strings[3] = odd;
        strings[4] = even;

        System.out.println("Index 0 = " + strings[0]);
        System.out.println("Index 1 = " + strings[1]);
        System.out.println("Index 2 = " + strings[2]);
        System.out.println("Index 3 = " + strings[3]);
        System.out.println("Index 4 = " + strings[4]);
    }
}

