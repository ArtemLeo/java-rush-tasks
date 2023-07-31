package Level_2_Array;

// Удаляем одинаковые строки;

import java.util.Scanner;

public class Task_008_Array {
    public static String[] strings = new String[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (current == null) {
                    break;
                } else if (current.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }
}
