package course;
import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students;
    private List<Course> courses;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        initCourses(); // Initialize with predefined courses
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    public List<Course> getCourses() {
        return courses;
    }

    private void initCourses() {
        courses.add(new Course("C101", "Introduction to Programming", "1 Year"));
        courses.add(new Course("C102", "Data Structures", "1 Year"));
        courses.add(new Course("C103", "Database Management", "1 Year"));
        courses.add(new Course("C104", "Computer Networks", "1 Year"));
        courses.add(new Course("C105", "Operating Systems", "1 Year"));
    }
}

