package course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private long id;

//    @Column(name="courseName") // not necessary since the names are same
    private String courseName;
//    @Column(name="instructor")

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
