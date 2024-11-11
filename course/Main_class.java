package course;
import java.util.Date;
import java.util.Scanner;

public class Main_class {
    public static void main(String[] args) {
        University university = new University("Tech University");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== University Registration System ===");
            System.out.println("1. Enroll Student");
            System.out.println("2. Register Course for Student");
            System.out.println("3. Display Student Details");
            System.out.println("4. Display Course List");
            System.out.println("5. Schedule Course for Student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    Student newStudent = new Student(studentName);
                    university.addStudent(newStudent);
                    System.out.println("Student enrolled with ID: " + newStudent.getStudentID());
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    String studentID = scanner.nextLine();
                    Student student = university.getStudentById(studentID);
                    if (student == null) {
                        System.out.println("Student not found.");
                        break;
                    }
                    System.out.println("Available Courses:");
                    for (Course course : university.getCourses()) {
                        System.out.println(course.getCourseID() + ": " + course.getCourseName());
                    }
                    System.out.print("Enter course ID to register: ");
                    String courseID = scanner.nextLine();
                    Date regDate = new Date();
                    Registration registration = new Registration(courseID, regDate, "Not scheduled");
                    student.registerCourse(registration);
                    System.out.println("Course registered successfully.");
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    String searchID = scanner.nextLine();
                    Student searchedStudent = university.getStudentById(searchID);
                    if (searchedStudent == null) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.println("Student Name: " + searchedStudent.getName());
                        System.out.println("Student ID: " + searchedStudent.getStudentID());
                        System.out.println("Registered Courses:");
                        for (Registration reg : searchedStudent.getRegistrations()) {
                            System.out.println("- " + reg.getCourseID() + " (Registered on: " + reg.getRegistrationDate() + ")");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Course List:");
                    for (Course course : university.getCourses()) {
                        System.out.println(course.getCourseID() + ": " + course.getCourseName() + " (" + course.getDuration() + ")");
                    }
                    break;

                case 5:
                    System.out.print("Enter student ID to schedule: ");
                    String idForScheduling = scanner.nextLine();
                    Student scheduleStudent = university.getStudentById(idForScheduling);
                    if (scheduleStudent == null) {
                        System.out.println("Student not found.");
                        break;
                    }
                    System.out.print("Enter course ID to schedule: ");
                    String courseIdToSchedule = scanner.nextLine();
                    System.out.print("Enter schedule day (e.g., Monday): ");
                    String day = scanner.nextLine();
                    System.out.print("Enter schedule time (e.g., 10:00 AM): ");
                    String time = scanner.nextLine();
                    Registration scheduleReg = new Registration(courseIdToSchedule, new Date(), day + " " + time);
                    scheduleStudent.registerCourse(scheduleReg);
                    System.out.println("Course scheduled successfully.");
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


