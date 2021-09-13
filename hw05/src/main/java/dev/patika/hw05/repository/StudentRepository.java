package dev.patika.hw05.repository;

import dev.patika.hw05.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    List<Student> findStudentByS_name(String s);
    List<Student> findStudentById(int id);


}
