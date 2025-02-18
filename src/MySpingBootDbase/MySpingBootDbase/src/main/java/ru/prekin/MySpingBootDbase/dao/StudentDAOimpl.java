package ru.prekin.MySpingBootDbase.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.prekin.MySpingBootDbase.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;

@Slf4j
@Repository
public class StudentDAOimpl implements StudentDAO {

    private static final Logger log = LoggerFactory.getLogger(StudentDAOimpl.class);
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> getAllStudents() {
        Query query = entityManager.createQuery("from Student");
        List<Student> allStudents = query.getResultList();
        log.info("getAllStudents" + allStudents);
        return allStudents;
    }

    @Override
    public Student saveStudent(Student student) {return entityManager.merge(student);}

    @Override
    public Student getStudent(int id) { return entityManager.find(Student.class, id);}

    @Override
    public void deleteStudent(int id) {
        Query query = entityManager.createQuery("delete from Student " + " where id =:studentId");
                query.setParameter("studentId", id);
        query.executeUpdate();
    }
}
