package jpa.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.HashSet;
import java.util.Set;

@Repository
public class MenDAO implements MenDAOInterface{
//    @PersistenceContext
//    private EntityManager entityManager;

    @Autowired
    private SessionFactory sessionFactory;

//    public void saveMen(Men men) {
//        entityManager.persist(men);
//    }

    public void saveOrUpdate(Men men) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Men where name = :name");
        query.setParameter("name", men.getName());
        Men manInDB = (Men)query.uniqueResult();

        if (manInDB != null) {
            men.getHobbyList().removeAll(manInDB.getHobbyList());
            men.getHobbyList().forEach(h->manInDB.getHobbyList().add(h));
            sessionFactory.getCurrentSession().update(manInDB);
        } else {
            sessionFactory.getCurrentSession().saveOrUpdate(men);
        }
    }

    public void delete(int id) {
        Men men = sessionFactory.getCurrentSession().get(Men.class, id);
        sessionFactory.getCurrentSession().delete(men);
    }

    public void delete(String name) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Men where name = :name");
        query.setParameter("name", name);
        Men man = (Men)query.uniqueResult();
        sessionFactory.getCurrentSession().delete(man);
    }
}
