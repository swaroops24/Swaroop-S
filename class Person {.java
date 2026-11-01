class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    double basicSalary;

    Employee(String name, int age, int id, double salary) {
        super(name, age);
        employeeId = id;
        basicSalary = salary;
        System.out.println("Employee constructor");
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    Manager(String name, int age, int id, double salary,
            String department, double bonus) {
        super(name, age, id, salary);
        this.department = department;
        this.bonus = bonus;
        System.out.println("Manager constructor");
    }

    double totalSalary() {
        return basicSalary + bonus;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Total salary: " + totalSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Anu", 30, 101, 50000, "IT", 10000);
        m.display();
    }
}
