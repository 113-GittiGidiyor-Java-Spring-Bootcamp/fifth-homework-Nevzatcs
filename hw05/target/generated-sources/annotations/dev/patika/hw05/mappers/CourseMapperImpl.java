package dev.patika.hw05.mappers;

import dev.patika.hw05.dto.CourseDTO;
import dev.patika.hw05.model.Course;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-13T14:57:11+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_301 (Oracle Corporation)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public Course mapFromCourseDTOtoCourse(CourseDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Course course = new Course();

        course.setId( dto.getId() );
        course.setCourseName( dto.getCourseName() );
        course.setCourseCode( dto.getCourseCode() );
        course.setCreditScore( dto.getCreditScore() );

        return course;
    }

    @Override
    public CourseDTO mapFromCoursetoCourseDTO(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setId( course.getId() );
        courseDTO.setCourseName( course.getCourseName() );
        courseDTO.setCourseCode( course.getCourseCode() );
        courseDTO.setCreditScore( course.getCreditScore() );

        return courseDTO;
    }
}
