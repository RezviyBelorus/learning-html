package jpa;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    @Autowired
    private SessionFactory session;

    @Override
    public void add(Student student) {
        session.getCurrentSession().save(student);
    }

    @Override
    public void edit(Student student) {
        session.getCurrentSession().update(student);
    }

    @Override
    public void delete(int studentId) {
        session.getCurrentSession().delete(getStudent(studentId));
    }

    @Override
    public Student getStudent(int studentId) {
        return (Student) session.getCurrentSession().get(Student.class, studentId);
    }

    //    @Override
//    public List<Men> getAllStudents() {
//        return session.getCurrentSession().createQuery("from student").list();
//    }
    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}
