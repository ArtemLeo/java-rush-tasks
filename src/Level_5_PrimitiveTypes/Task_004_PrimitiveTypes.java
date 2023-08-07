package Level_5_PrimitiveTypes;

// Бесконечность не предел;

public class Task_004_PrimitiveTypes {
    public static void main(String[] args) {
        div(0.0, 10);
        div(0.0, -10);
        System.out.println("--------------------");

        div(0, 1);
        div(0, -1);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }

    public static void div(float a, float b) {
        System.out.println(b / a);
    }
}
