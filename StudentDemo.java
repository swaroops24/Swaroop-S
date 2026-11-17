import java.util.Scanner;

class Student {
    String usn;
    String name;
    String branch;
    String phone;

    // Reads the details of one student from the user
    void readDetails(Scanner sc) {
        System.out.print("Enter USN    : ");
        usn = sc.nextLine();
        System.out.print("Enter Name   : ");
        name = sc.nextLine();
        System.out.print("Enter Branch : ");
        branch = sc.nextLine();
        System.out.print("Enter Phone  : ");
        phone = sc.nextLine();
    }

    // Prints the details of one student as a table row
    void display() {
        System.out.printf("%-15s %-20s %-12s %-15s%n", usn, name, branch, phone);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students (N): ");
        int n = Integer.parseInt(sc.nextLine().trim());

        Student[] students = new Student[n];

        // Create N Student objects and read their details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].readDetails(sc);
        }

        // Print the details with headings
        System.out.println("\n================ STUDENT DETAILS ================");
        System.out.printf("%-15s %-20s %-12s %-15s%n", "USN", "NAME", "BRANCH", "PHONE");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}