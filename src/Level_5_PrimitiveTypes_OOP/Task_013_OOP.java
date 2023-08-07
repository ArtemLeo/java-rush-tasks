package Level_5_PrimitiveTypes_OOP;

// Наследование переменных;

public class Task_013_OOP {
}

class ElectricCar extends Car{
    int electricEnginePower;
}


class Vehicle {
    double maxSpeed;
}

class Car extends Vehicle{
    int wheelCount;
    double weight;
}
