package Level_1_While_DoWhile_For;

public class Task_001_While {

    // Я никогда не буду работать за копейки;

    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int count = 1;
        while (count <= 100) {
            System.out.println(count + " - " + quote);
            count++;
        }
        System.out.println("----------------------------------------");

        int countFor;
        for (countFor = 1; countFor <= 100; countFor++) {
            System.out.println(countFor + " - " + quote);
        }
    }
}
