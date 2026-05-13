import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManagementCLI {

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Student
    static void addStudent() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        list.add(new Student(id, name, course));

        System.out.println("\nStudent Added Successfully!");
    }

    // View Students
    static void viewStudents() {

        if (list.isEmpty()) {
            System.out.println("\nNo Records Found!");
            return;
        }

        System.out.println();

        for (Student s : list) {

            System.out.println(
                "ID: " + s.id +
                ", Name: " + s.name +
                ", Course: " + s.course
            );
        }
    }

    // Update Student
    static void updateStudent() {

        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : list) {

            if (s.id == id) {

                System.out.print("Enter new Name: ");
                s.name = sc.nextLine();

                System.out.print("Enter new Course: ");
                s.course = sc.nextLine();

                System.out.println("\nUpdated Successfully!");
                return;
            }
        }

        System.out.println("\nStudent Not Found!");
    }

    // Delete Student
    static void deleteStudent() {

        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {

            Student s = it.next();

            if (s.id == id) {

                it.remove();

                System.out.println("\nDeleted Successfully!");
                return;
            }
        }

        System.out.println("\nStudent Not Found!");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("\nExiting...");
                    System.exit(0);

                default:
                    System.out.println("\nInvalid Choice!");
            }
        }
    }
}