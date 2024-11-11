package course;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int rollNumberCounter = 1000; // Auto-incrementing roll number
    private String studentID;
    private String name;
    private List<Registration> registrations;

    public Student(String name) {
        this.studentID = "S" + rollNumberCounter++;
        this.name = name;
        this.registrations = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void registerCourse(Registration registration) {
        registrations.add(registration);
    }
}

