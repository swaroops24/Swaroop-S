class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Parent brand: " + brand);
    }
}

class Car extends Vehicle {
    String brand;

    Car(String parentBrand, String carBrand) {
        super(parentBrand);
        this.brand = carBrand;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Child brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Fortuner");
        c.display();
    }
}
