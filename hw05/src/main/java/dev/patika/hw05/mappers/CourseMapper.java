package dev.patika.hw05.mappers;

import dev.patika.hw05.dto.CourseDTO;
import dev.patika.hw05.model.Course;
import org.mapstruct.Mapper;

@Mapper
public interface CourseMapper {
    public abstract Course mapFromCourseDTOtoCourse(CourseDTO dto);
    CourseDTO mapFromCoursetoCourseDTO(Course course);
}
