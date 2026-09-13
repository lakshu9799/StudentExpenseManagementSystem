public class Marks {

    private int math;
    private int java;
    private int dbms;
    private int os;
    private int computerNetworks;

    public Marks(int math, int java, int dbms, int os, int computerNetworks) {
        this.math = math;
        this.java = java;
        this.dbms = dbms;
        this.os = os;
        this.computerNetworks = computerNetworks;
    }

    public int calculateTotal() {
        return math + java + dbms + os + computerNetworks;
    }

    public double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayMarks() {
        System.out.println("\n===== MARKS DETAILS =====");
        System.out.println("Mathematics       : " + math);
        System.out.println("Java              : " + java);
        System.out.println("DBMS              : " + dbms);
        System.out.println("Operating System  : " + os);
        System.out.println("Computer Networks : " + computerNetworks);

        System.out.println("-------------------------");
        System.out.println("Total             : " + calculateTotal());
        System.out.println("Percentage        : " + calculatePercentage() + "%");
        System.out.println("Grade             : " + calculateGrade());
    }
}