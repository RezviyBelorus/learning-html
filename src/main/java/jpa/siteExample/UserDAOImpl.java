package jpa.siteExample;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> findAllUsers() {
        return entityManager.createQuery("from User ").getResultList();
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<User> cq = builder.createQuery(User.class);
//        Root<User> root = cq.from(User.class);
//        cq.select(root);
//        return entityManager.createQuery(cq).getResultList();
    }
}
