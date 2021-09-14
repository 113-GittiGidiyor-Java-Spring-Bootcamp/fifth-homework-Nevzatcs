package dev.patika.hw05.controller;

import dev.patika.hw05.model.Course;
import dev.patika.hw05.repository.CourseRepository;
import dev.patika.hw05.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CourseControllerTest {
    @Mock
    CourseService mockCourseService;
    @InjectMocks
    CourseController courseController;
    @Mock
    CourseRepository MockCourseRepository;

    @Test
    void findAll() {
        //given

        List<Course> courses  = new ArrayList<Course>();
        Mockito.when(mockCourseService.findAll()).thenReturn(courses);
        //when
        courses = this.courseController.findAll().getBody();

        //then
        assertNotNull(courses);
    }



    @Test
    void deleteCourseById() {
        //given
        MockCourseRepository.deleteById(1000);
        //when
        assertEquals(false, MockCourseRepository.findById(1000).isPresent());

        //then


    }

    @Test
    void findCourseById() {
        Course course = new Course();
        course.setId(5);
        List<Course> courses = new ArrayList<>();
        courses.add(course);

        lenient().when(MockCourseRepository.findCourseById(5)).thenReturn(courses);
        mockCourseService.findById(5);


    }


    @Test
    void updateCourse() {
        Course course = new Course();
        course.setId(5);
        course.setCourseName("Test Name");
        Course newCourse = new Course();
        course.setCourseName("New Test Name");

        when(MockCourseRepository.findById(course.getId())).thenReturn(Optional.of(course));
        mockCourseService.updateOnDatabase(newCourse);
        verify(MockCourseRepository).save(newCourse);
        verify(MockCourseRepository).findById(course.getId());
    }

    @Test
    void getCoursesWithName() {
        Course course = new Course();
        Course course1 = new Course();
        course.setCourseName("Math");
        List<Course> courses  = new ArrayList<Course>();
        List<Course> courses1  = new ArrayList<Course>();
        courses1.add(course1);
        courses.add(course);
        Mockito.when(mockCourseService.getCoursesWithName(course.getCourseName())).thenReturn(courses);
        //when


        //then
        assertEquals(course,courses1);
        //assertNotNull(courses);
    }


}