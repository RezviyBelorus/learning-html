package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public void add(Student student) {
        studentDAO.add(student);
    }

    @Override
    public void edit(Student student) {
        studentDAO.edit(student);
    }

    @Override
    public void delete(int studentId) {
        studentDAO.delete(studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        return studentDAO.getStudent(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }
}
