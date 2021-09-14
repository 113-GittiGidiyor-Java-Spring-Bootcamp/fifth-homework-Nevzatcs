package dev.patika.hw05.service;

import dev.patika.hw05.model.Course;
import dev.patika.hw05.repository.CourseRepository;
import dev.patika.hw05.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.lenient;

class CourseServiceTest {
    @Mock
    CourseRepository mockCourseRepository;

    @InjectMocks
    CourseService courseService;

    @Test
    void findAll() {
        List<Course> courses  = new ArrayList<Course>();
        Mockito.when(mockCourseRepository.findAll()).thenReturn(courses);

        boolean b = this.courseService.findAll().isEmpty();
        assertNotNull(b);
    }

    @Test
    void findById() {
        Course course = new Course();
        course.setId(5);
        List<Course> courses = new ArrayList<>();
        courses.add(course);

        lenient().when(mockCourseRepository.findCourseById(5)).thenReturn(courses);
        courseService.findById(5);
    }

    @Test
    void save() {
    }

    @Test
    void deleteById() {
        //given
        courseService.deleteById(1000);
        //when
        assertEquals(false, mockCourseRepository.findById(1000).isPresent());
    }
}