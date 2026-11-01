class Result {
    int total;
    double average;

    Result(int total, double average) {
        this.total = total;
        this.average = average;
    }

    void display() {
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}

class Student {
    private String usn, name;
    private int m1, m2, m3;
    static int count = 0;
    final int MAX_MARKS = 100;

    Student(String usn, String name, int m1, int m2, int m3) {
        this.usn = usn;
        this.name = name;
        if (valid(m1) && valid(m2) && valid(m3)) {
            this.m1 = m1; this.m2 = m2; this.m3 = m3;
        } else {
            throw new IllegalArgumentException("Marks must be from 0 to 100");
        }
        count++;
    }

    private boolean valid(int mark) {
        return mark >= 0 && mark <= MAX_MARKS;
    }

    String getUsn() { return usn; }
    String getName() { return name; }

    Result calculateResult() {
        int total = m1 + m2 + m3;
        return new Result(total, total / 3.0);
    }

    void display() {
        System.out.println("USN: " + usn + ", Name: " + name);
    }

    void display(boolean showResult) {
        display();
        if (showResult) calculateResult().display();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("1CT24CS001", "Anu", 85, 90, 80);
        s.display();
        s.display(true);
        System.out.println("Students created = " + Student.count);
    }
}
