package dev.patika.hw05.controller;

import dev.patika.hw05.model.Course;
import dev.patika.hw05.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)

class CourseControllerTest {
    @Mock
    CourseService mockCourseService;
    @InjectMocks
    CourseController courseController;

    @Test
    void findAll() {
        //given
        Course course = new Course();
        List<Course> courses  = new ArrayList<Course>();
        Mockito.when(mockCourseService.findAll()).thenReturn(courses);
        //when
        courses = this.courseController.findAll().getBody();

        //then
        assertNotNull(courses);
    }

    @Test
    void saveCourses() {
    }

    @Test
    void deleteCourseById() {
    }

    @Test
    void findCourseById() {
    }

    @Test
    void updateCourse() {
    }

    @Test
    void getCoursesWithName() {
    }

    @Test
    void getCourseWithId() {
    }
}