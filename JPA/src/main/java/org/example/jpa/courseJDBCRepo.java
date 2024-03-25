package org.example.jpa;

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
                   values(1,'learn AWS','AWS Academy')
                    
                    """;
    public void insert(){
        springJdbcTemplate.update(Insert_Query);
    }
}
