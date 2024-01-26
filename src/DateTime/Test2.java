package DateTime;

public class Test2 {
    public static void main(String[] args) {
        Car c = Car.ceateCar();
    }
}

class Car {
    private Car() {
    }

    static Car ceateCar() {
        return new Car();
    }
}