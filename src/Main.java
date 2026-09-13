import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManager manager = new StudentManager();
        Menu menu = new Menu();

        while (true) {

            menu.displayMenu();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    manager.addStudent();
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    manager.searchStudent();
                    break;

                case 4:
                    manager.updateStudent();
                    break;

                case 5:
                    manager.deleteStudent();
                    break;

                case 6:
                    manager.addMarks();
                    break;

                case 7:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();

                    Student student = manager.getStudentById(id);

                    if (student == null) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.println("Report feature will be connected next.");
                    }
                    break;

                case 8:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}