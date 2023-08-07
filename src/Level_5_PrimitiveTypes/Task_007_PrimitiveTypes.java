package Level_5_PrimitiveTypes;

// Правильные типы;

public class Task_007_PrimitiveTypes {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value) {
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}
