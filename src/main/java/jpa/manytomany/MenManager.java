package jpa.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MenManager {
    @Autowired
    MenDAO menDAO;

//    @Transactional
//    public void saveMen(Men men) {
//        menDAO.saveMen(men);
//    }

    @Transactional
    public void saveOrUpdateMen(Men men) {
        menDAO.saveOrUpdate(men);
    }

    @Transactional
    public void delete(int id) {
        menDAO.delete(id);
    }

    @Transactional
    public void delete(String name) {
        menDAO.delete(name);
    }
}
