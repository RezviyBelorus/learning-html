package jpa.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentManager {
    @Autowired
    StudentDAO studentDAO;

    @Transactional
    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }

}
