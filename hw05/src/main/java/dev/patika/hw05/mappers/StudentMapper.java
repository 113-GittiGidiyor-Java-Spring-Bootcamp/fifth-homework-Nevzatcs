package dev.patika.hw05.mappers;

import dev.patika.hw05.dto.StudentDTO;
import dev.patika.hw05.model.Student;

public interface StudentMapper {
    Student mapFromStudentDTOtoStudent(StudentDTO dto);
    StudentDTO mapFromStudenttoStudentrDTO(Student student);
}
