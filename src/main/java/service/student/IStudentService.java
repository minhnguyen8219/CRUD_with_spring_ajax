package service.student;

import model.Student;
import service.IService;

public interface IStudentService extends IService<Student> {
    Iterable<Student> findAllByNameContaining(String name);
}
