package Level_4_Methods;

// Кубический калькулятор в кубе;

public class Task_009_Methods {
    public static void main(String[] args) {
        long a = 3;
        System.out.println(ninthDegree(a));
    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long a) {
        long result = cube(a);
        return cube(result);
    }
}

