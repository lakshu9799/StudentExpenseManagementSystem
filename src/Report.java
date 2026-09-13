public class Report {

    public void generateReport(Student student, Marks marks) {

        System.out.println("\n================================");
        System.out.println("       STUDENT REPORT");
        System.out.println("================================");

        System.out.println("Student ID : " + student.getId());
        System.out.println("Name       : " + student.getName());
        System.out.println("Age        : " + student.getAge());
        System.out.println("Course     : " + student.getCourse());
        System.out.println("Email      : " + student.getEmail());

        System.out.println("--------------------------------");

        System.out.println("Total Marks : " + marks.calculateTotal());
        System.out.println("Percentage  : " + marks.calculatePercentage() + "%");
        System.out.println("Grade       : " + marks.calculateGrade());

        if (marks.calculatePercentage() >= 40) {
            System.out.println("Status      : PASS");
        } else {
            System.out.println("Status      : FAIL");
        }

        System.out.println("================================");
    }
}