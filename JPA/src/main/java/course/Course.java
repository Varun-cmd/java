package course;

public class Course {
    private long id;
    private String courseName;
    private String instructor;

    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public Course() {
    }

    public Course(long id, String courseName, String instructor) {
        this.id = id;
        this.courseName = courseName;
        this.instructor = instructor;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
