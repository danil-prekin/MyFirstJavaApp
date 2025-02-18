package ru.prekin.MySpingBootDbase.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import ru.prekin.MySpingBootDbase.entity.Discipline;

import java.util.List;

@Repository
public class DisciplineDAOimpl implements DisciplineDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Discipline> getAllDisciplines() {
        Query query = entityManager.createQuery("from Discipline", Discipline.class);
        return query.getResultList();
    }

    @Override
    public Discipline saveDiscipline(Discipline discipline) {
        return entityManager.merge(discipline);
    }

    @Override
    public Discipline getDiscipline(int id) {
        return entityManager.find(Discipline.class, id);
    }

    @Override
    public void deleteDiscipline(int id) {
        Query query = entityManager.createQuery("delete from Discipline where id =:disciplineId");
        query.setParameter("disciplineId", id);
        query.executeUpdate();
    }
}
