package dev.patika.hw05.service;

import dev.patika.hw05.model.Student;
import dev.patika.hw05.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    @Mock
    StudentRepository mockStudentRepository;

    @InjectMocks
    StudentService studentService;

    @Test
    void findAll() {
        Student student = new Student();
        List<Student> students  = new ArrayList<>();
        students.add(student);

        Mockito.when(studentService.findAll()).thenReturn(students);
        students = studentService.findAll();

        assertNotNull(students);

    }

    @Test
    void findById() {
        Student stu = new Student();
        stu.setId(5);
        List<Student> stus = new ArrayList<>();
        stus.add(stu);


        mockStudentRepository.findById(5);

        assertNotNull(stu);
    }

    @Test
    void save() {
    }

    @Test
    void deleteById() {
        Student student1 = new Student();
        student1.setId(1000);
        List<Student> stus = new ArrayList<>();
        stus.add(student1);

        Mockito.when(mockStudentRepository.findStudentById(1000)).thenReturn(stus);
        //when
        studentService.deleteById(1000);
    }
}