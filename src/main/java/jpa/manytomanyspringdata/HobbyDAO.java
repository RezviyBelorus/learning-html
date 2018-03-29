package jpa.manytomanyspringdata;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class HobbyDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveHobby(Hobby hobby) {
        entityManager.persist(hobby);
    }
}
