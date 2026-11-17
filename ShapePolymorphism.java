import java.util.Scanner;

// Base Class: Shape
class Shape {
    // Protected member data
    protected String shapeName;

    // Base constructor
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public Shape() {
        this.shapeName = "Generic Shape";
    }

    // Member function: draw()
    public void draw() {
        System.out.println("Drawing " + shapeName);
    }

    // Member function: erase()
    public void erase() {
        System.out.println("Erasing " + shapeName);
    }
}

// Subclass 1: Circle
class Circle extends Shape {
    // Member data specific to Circle
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Overriding draw()
    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius);
    }

    // Overriding erase()
    @Override
    public void erase() {
        System.out.println("Erasing Circle with radius: " + radius);
    }
}

// Subclass 2: Triangle
class Triangle extends Shape {
    // Member data specific to Triangle
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    // Overriding draw()
    @Override
    public void draw() {
        System.out.println("Drawing Triangle with base: " + base + " and height: " + height);
    }

    // Overriding erase()
    @Override
    public void erase() {
        System.out.println("Erasing Triangle with base: " + base + " and height: " + height);
    }
}

// Subclass 3: Square
class Square extends Shape {
    // Member data specific to Square
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    // Overriding draw()
    @Override
    public void draw() {
        System.out.println("Drawing Square with side: " + side);
    }

    // Overriding erase()
    @Override
    public void erase() {
        System.out.println("Erasing Square with side: " + side);
    }
}

// Main Program
public class ShapePolymorphism {
    public static void main(String[] args) {
        System.out.println("=== Demonstration of Polymorphism in Java ===");

        // Superclass reference variable 's'
        Shape s;

        // 1. Pointing to Circle object
        s = new Circle(5.5);
        s.draw();   // Resolves to Circle's draw() at runtime
        s.erase();  // Resolves to Circle's erase() at runtime
        System.out.println("----------------------------------------------");

        // 2. Pointing to Triangle object
        s = new Triangle(4.0, 7.0);
        s.draw();   // Resolves to Triangle's draw() at runtime
        s.erase();  // Resolves to Triangle's erase() at runtime
        System.out.println("----------------------------------------------");

        // 3. Pointing to Square object
        s = new Square(6.0);
        s.draw();   // Resolves to Square's draw() at runtime
        s.erase();  // Resolves to Square's erase() at runtime
        System.out.println("----------------------------------------------");

        // 4. Demonstration using an array of Shape references (Heterogeneous Collection)
        System.out.println("=== Iterating Over Polymorphic Array ===");
        Shape[] shapes = {
            new Circle(2.5),
            new Triangle(3.0, 5.0),
            new Square(4.0)
        };

        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            System.out.println();
        }
    }
}