class Person {
    private String name;
    private int age;
    static int count = 0;
    final String COLLEGE = "ABC College";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    String getName() { return name; }
    int getAge() { return age; }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void displayDetails(boolean showCollege) {
        displayDetails();
        if (showCollege) System.out.println("College: " + COLLEGE);
    }

    static class Department {
        String departmentName;

        Department(String name) {
            departmentName = name;
        }

        void display() {
            System.out.println("Department: " + departmentName);
        }
    }
}

class Student extends Person {
    String usn, course;

    Student(String name, int age, String usn, String course) {
        super(name, age);
        this.usn = usn;
        this.course = course;
    }

    @Override
    void displayDetails() {
        System.out.println("Student: " + getName() + ", Age: " + getAge()
                + ", USN: " + usn + ", Course: " + course);
    }
}

class Faculty extends Person {
    String subject;

    Faculty(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Faculty: " + getName() + ", Subject: " + subject);
    }
}

class Administrator extends Person {
    String role;

    Administrator(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    void displayDetails() {
        System.out.println("Administrator: " + getName() + ", Role: " + role);
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Student("Anu", 19, "1CT24CS001", "CSE"),
            new Faculty("Ravi", 40, "Java"),
            new Administrator("Meena", 35, "Office Manager")
        };

        for (Person p : people) p.displayDetails();

        Person.Department d = new Person.Department("Computer Science");
        d.display();

        System.out.println("Total people = " + Person.count);
    }
}
