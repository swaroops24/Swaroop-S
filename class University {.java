class University {
    String universityName = "ABC University";

    static class Department {
        String departmentName;

        Department(String name) {
            departmentName = name;
        }

        void display() {
            System.out.println("Department: " + departmentName);
        }
    }

    class Faculty {
        String facultyName, designation;

        Faculty(String name, String designation) {
            facultyName = name;
            this.designation = designation;
        }

        void display() {
            System.out.println("Faculty: " + facultyName);
            System.out.println("Designation: " + designation);
            System.out.println("University: " + universityName);
        }
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
    }
}

public class Main {
    public static void main(String[] args) {
        University.Department d =
                new University.Department("Computer Science");

        University u = new University();
        University.Faculty f = u.new Faculty("Ravi", "Professor");

        u.displayUniversity();
        d.display();
        f.display();
    }
}
