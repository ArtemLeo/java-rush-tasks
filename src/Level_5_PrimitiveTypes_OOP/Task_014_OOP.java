package Level_5_PrimitiveTypes_OOP;

// Наследование методов;

public class Task_014_OOP {
}

class Entity {
    public void move() {
        System.out.println("Я передвигаюсь.");
    }

    public void eat() {
        System.out.println("Я ем.");
    }
}

class Man extends Entity{
    public void speak() {
        System.out.println("Я умею общаться.");
    }
}

class JavaDeveloper extends Man{
    public void code(){
        System.out.println("Я умею общаться на Java.");
    }
}


