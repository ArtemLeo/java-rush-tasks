package Level_1_While_DoWhile_For;

// Сумма чисел, не кратных 3-м ;

public class Task_007_While {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        while (count <= 100) {
            if (count % 3 == 0) {
                count++;
                continue;
            } else {
                sum += count;
                System.out.println(count);
                count++;
            }
        }
        System.out.println("-----------");
        System.out.println("sum = " + sum);
    }
}
