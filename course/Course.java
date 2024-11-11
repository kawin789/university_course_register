package course;

public class Course {
    private String courseID;
    private String courseName;
    private String duration;

    public Course(String courseID, String courseName, String duration) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }
}
