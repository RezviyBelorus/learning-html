package jpa.onetomany;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class StudentDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveStudent(Student student) {
        entityManager.persist(student);
    }

}
