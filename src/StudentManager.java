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
    public Student searchStudent() {

        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {
                System.out.println("\nStudent Found!");
                System.out.println(student);
                return student;
            }
        }

        System.out.println("Student not found.");
        return null;
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

    // Get student by ID
    public Student getStudentById(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    // Add Marks
    public Marks addMarks() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        Student student = getStudentById(id);

        if (student == null) {
            System.out.println("Student not found.");
            return null;
        }

        System.out.println("\nEnter marks out of 100:");

        System.out.print("Mathematics: ");
        int math = scanner.nextInt();

        System.out.print("Java: ");
        int java = scanner.nextInt();

        System.out.print("DBMS: ");
        int dbms = scanner.nextInt();

        System.out.print("Operating System: ");
        int os = scanner.nextInt();

        System.out.print("Computer Networks: ");
        int computerNetworks = scanner.nextInt();

        if (!InputValidator.isValidMarks(math) ||
            !InputValidator.isValidMarks(java) ||
            !InputValidator.isValidMarks(dbms) ||
            !InputValidator.isValidMarks(os) ||
            !InputValidator.isValidMarks(computerNetworks)) {

            System.out.println("Invalid marks! Marks must be between 0 and 100.");
            return null;
        }

        Marks marks = new Marks(
                math,
                java,
                dbms,
                os,
                computerNetworks
        );

        System.out.println("Marks added successfully!");

        marks.displayMarks();

        return marks;
    }
}