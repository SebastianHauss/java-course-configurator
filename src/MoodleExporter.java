import java.util.Scanner;

public class MoodleExporter implements Exporter {
    private static final String MOODLE_IP = "technikum-wien.at";
    private Scanner scanner = new Scanner(System.in);

    public MoodleExporter() {
    }

    public void export(Course course) {
        if (course.getElements().isEmpty()) {
            throw new IllegalArgumentException("Course is empty");
        } else {
            System.out.print("Enter Moodle server IP: ");
            String input = this.scanner.nextLine();

            if (!input.equals(MOODLE_IP)) {
                System.out.println("Server timeout: " + input);
            } else {
                System.out.println("Successfully uploaded course " + course.getName() + " to: " + MOODLE_IP);
            }
        }
    }
}
