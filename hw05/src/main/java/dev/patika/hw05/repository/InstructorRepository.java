package dev.patika.hw05.repository;

import dev.patika.hw05.model.Instructor;
import dev.patika.hw05.model.PermanentInstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor,Integer> {
    List<Instructor> findByName(String s);
    List<Instructor> findInstructorById(int id);
    List<PermanentInstructor> getPermanentInstructorBySalary(int id);
}
