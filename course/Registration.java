package course;
import java.util.Date;

public class Registration {
    private String courseID;
    private Date registrationDate;
    private String schedule;

    public Registration(String courseID, Date registrationDate, String schedule) {
        this.courseID = courseID;
        this.registrationDate = registrationDate;
        this.schedule = schedule;
    }

    public String getCourseID() {
        return courseID;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public String getSchedule() {
        return schedule;
    }
}

