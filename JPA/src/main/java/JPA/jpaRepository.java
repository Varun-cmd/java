package JPA;


import course.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.metamodel.mapping.EntityIdentifierMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class jpaRepository {


    @PersistenceContext                 //@autowired also works
    private EntityManager entityManager;
    public void insert(Course course){
        entityManager.merge(course);                    // insertion into the table
    }
    public Course findById(long id ){
       return entityManager.find(Course.class,id);

    }
    public void deleteById(long id){
        Course course = entityManager.find(Course.class,id);
          entityManager.remove(course);
    }


}
