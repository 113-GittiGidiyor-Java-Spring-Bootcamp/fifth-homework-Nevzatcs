package dev.patika.hw05.mappers;

import dev.patika.hw05.dto.InstructorDTO;
import dev.patika.hw05.model.Instructor;

public interface InstructorMapper {
    Instructor mapFromInstructorDTOtoInstructor(InstructorDTO dto);
    InstructorDTO mapFromInstructortoInstructorDTO(Instructor instructor);
}
