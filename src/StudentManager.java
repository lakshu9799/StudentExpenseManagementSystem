import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add Student
    public void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Student student = new Student(id, name, age, course, email);
        students.add(student);

        System.out.println("Student added successfully!");
    }

    // View Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Search Student
    public void searchStudent() {

        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {
                System.out.println("\nStudent Found!");
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update Student
    public void updateStudent() {

        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Student student : students) {

            if (student.getId() == id) {

                System.out.print("Enter New Name: ");
                student.setName(scanner.nextLine());

                System.out.print("Enter New Age: ");
                student.setAge(scanner.nextInt());
                scanner.nextLine();

                System.out.print("Enter New Course: ");
                student.setCourse(scanner.nextLine());

                System.out.print("Enter New Email: ");
                student.setEmail(scanner.nextLine());

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete Student
    public void deleteStudent() {

        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}