package org.example.jpa;

import course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class courseJDBCRepo {

    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String Insert_Query =
            """
                   insert into course(courseId,courseName,instructor)
                   values(?,?,?)
                    """;
    private static String Delete_Query =
            """
                   delete from course
                   where courseId = ?
                    """;
    public void insert(Course course){
        springJdbcTemplate.update(Insert_Query,course.getId(),course.getCourseName(),course.getInstructor());

    }

    public void deleteById(long id ){
        springJdbcTemplate.update(Delete_Query,id);

    }
}
