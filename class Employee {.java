class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee {
    double allowance, bonus;

    PermanentEmployee(int id, String name, double basic,
                      double allowance, double bonus) {
        super(id, name, basic);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}

class ContractEmployee extends Employee {
    int hours;
    double hourlyRate;

    ContractEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hours = hours;
        hourlyRate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * hourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] staff = {
            new PermanentEmployee(1, "Asha", 30000, 5000, 2000),
            new ContractEmployee(2, "Ravi", 100, 250)
        };

        for (Employee e : staff) e.display();
    }
}
