package jpa.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HobbyManager {
    @Autowired
    private HobbyDAO hobbyDAO;

//    @Transactional
//    public void saveHobby(Hobby hobby) {
//        hobbyDAO.saveHobby(hobby);
//    }

//    @Transactional
//    public void saveOrUpdate(Hobby hobby) {
//        hobbyDAO.saveOrUpdate(hobby);
//    }
}
