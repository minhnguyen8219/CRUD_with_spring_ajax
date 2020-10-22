package service.student;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IStudentRepository;

public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Iterable<Student> findAllByNameContaining(String name) {
        return studentRepository.findAllByNameContaining(name);
    }

    @Override
    public Iterable findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findOne(id);
    }

    @Override
    public Student update(Student model) {
        Student s = model;
        studentRepository.save(model);
        return s;
    }

    @Override
    public Student save(Student model) {
        Student s = model;
        studentRepository.save(model);
        return s;
    }

    @Override
    public Student remove(int id) {
        Student s = findById(id);
        studentRepository.delete(id);
        return s;
    }
}
