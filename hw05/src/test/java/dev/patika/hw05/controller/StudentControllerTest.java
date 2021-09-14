package dev.patika.hw05.controller;

import dev.patika.hw05.model.Course;
import dev.patika.hw05.model.Student;
import dev.patika.hw05.repository.CourseRepository;
import dev.patika.hw05.repository.StudentRepository;
import dev.patika.hw05.service.CourseService;
import dev.patika.hw05.service.StudentService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.AdditionalAnswers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.lenient;

class StudentControllerTest {

    @Mock
    StudentService mockStudentService;
    @InjectMocks
    StudentController studentController;
    @Mock
    StudentRepository mockStudentRepository;


    @Test
    void findAll() {
        //given

        List<Student> students  = new ArrayList<>();
        ResponseEntity<List<Student>> responseEntity = new ResponseEntity<>(HttpStatus.OK);

        Mockito.when(mockStudentService.findAll()).thenReturn(students);

        responseEntity = studentController.findAll();
        //then
        assertNotNull(responseEntity);

    }

    @Test
    void saveStudent() {
        //given
        Course course = new Course(1,"Math",5,4,null,null);
        List<Course> courses = new ArrayList<>();
        courses.add(course);
        Student student = new Student();
        student.setId(1);


        Mockito.when(mockStudentService.save(student)).thenReturn(student);

        //when
        Student actual = this.studentController.saveStudent(student);

        //then
        assertEquals(student, actual);




    }

    @Test
    void deleteStudentById() {
        Student student1 = new Student();
        student1.setId(1000);

        Mockito.when(studentController.findStudentById(1000)).thenReturn(student1);
        //when
        mockStudentService.deleteById(1000);



    }

    @Test
    void findStudentById() {
        Student stu = new Student();
        stu.setId(5);
        List<Student> courses = new ArrayList<>();
        courses.add(stu);


        mockStudentService.findById(5);

        assertNotNull(stu);

    }


}