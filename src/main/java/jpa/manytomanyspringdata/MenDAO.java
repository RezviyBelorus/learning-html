package jpa.manytomanyspringdata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public interface MenDAO extends CrudRepository<Men, Integer>{


}
