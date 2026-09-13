import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_PATH = "../data/students.txt";

    public void saveStudents(ArrayList<Student> students) {

        try {
            FileWriter writer = new FileWriter(FILE_PATH);

            for (Student student : students) {
                writer.write(
                    student.getId() + "," +
                    student.getName() + "," +
                    student.getAge() + "," +
                    student.getCourse() + "," +
                    student.getEmail() + "\n"
                );
            }

            writer.close();
            System.out.println("Student data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving student data.");
        }
    }

    public ArrayList<Student> loadStudents() {

        ArrayList<Student> students = new ArrayList<>();

        try {
            File file = new File(FILE_PATH);

            if (!file.exists()) {
                return students;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 5) {

                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String course = data[3];
                    String email = data[4];

                    students.add(
                        new Student(id, name, age, course, email)
                    );
                }
            }

            reader.close();

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading student data.");
        }

        return students;
    }
}