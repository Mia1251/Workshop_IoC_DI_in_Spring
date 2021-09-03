package se.lexicon.workshop.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.workshop.models.Student;

import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao {

    List<Student> students;

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
