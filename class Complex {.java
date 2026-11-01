class Complex {
    double real, imaginary;

    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    Complex multiply(Complex c) {
        double r = real * c.real - imaginary * c.imaginary;
        double i = real * c.imaginary + imaginary * c.real;
        return new Complex(r, i);
    }

    int compareMagnitude(Complex c) {
        double m1 = Math.sqrt(real * real + imaginary * imaginary);
        double m2 = Math.sqrt(c.real * c.real + c.imaginary * c.imaginary);
        return Double.compare(m1, m2);
    }

    Complex copy() {
        return new Complex(real, imaginary);
    }

    void display() {
        System.out.println(real + (imaginary >= 0 ? " + " : " - ")
                + Math.abs(imaginary) + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(3, 2);
        Complex b = new Complex(1, 4);
        Complex copied = a.copy();

        System.out.print("Addition: ");
        a.add(b).display();

        System.out.print("Multiplication: ");
        a.multiply(b).display();

        System.out.println("Magnitude comparison: " + a.compareMagnitude(b));
        a.real = 99;
        System.out.print("Original after change: ");
        a.display();
        System.out.print("Copied object: ");
        copied.display();
    }
}
