package course;
public class Schedule {
    private String courseID;
    private String day;
    private String time;

    public Schedule(String courseID, String day, String time) {
        this.courseID = courseID;
        this.day = day;
        this.time = time;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }
}

