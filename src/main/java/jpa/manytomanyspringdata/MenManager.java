package jpa.manytomanyspringdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenManager {
    @Autowired
    MenDAO menDAO;

    @Transactional
    public void saveMen(Men men) {
        menDAO.save(men);
    }

    @Transactional
    public List<Men> findAll() {
        Iterable<Men> all = menDAO.findAll();
        List<Men> menList = new ArrayList<>();
        all.forEach(man -> {
            man.getHobbyList();
            menList.add(man);
        });
        return menList;
    }
}
