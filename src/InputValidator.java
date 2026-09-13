public class InputValidator {

    public static boolean isValidId(int id) {
        return id > 0;
    }

    public static boolean isValidAge(int age) {
        return age >= 15 && age <= 100;
    }

    public static boolean isValidMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
}