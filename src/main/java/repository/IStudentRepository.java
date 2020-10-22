package repository;

import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

    Iterable<Student> findAllByNameContaining(String Name);
}
