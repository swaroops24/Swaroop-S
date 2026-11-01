class A {
    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    B() {
        System.out.println("B constructor");
    }
}

class C extends B {
    C() {
        System.out.println("C constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
    }
}


Sample output:
Sum = 30
Product = 10.0
Largest = 30
Difference = 5.5

    
Explanation: Method overloading means using the same method name with different parameter lists. Java selects the method by matching the number and types of arguments at compile time
