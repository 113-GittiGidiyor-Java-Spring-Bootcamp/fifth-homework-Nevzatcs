package dev.patika.hw05.controller;

import dev.patika.hw05.model.Course;
import dev.patika.hw05.model.Instructor;
import dev.patika.hw05.repository.InstructorRepository;
import dev.patika.hw05.service.InstructorService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.lenient;

class InstructorControllerTest {
    @Mock
    InstructorService mockInstructorService;
    @InjectMocks
    InstructorController instructorController;

    @InjectMocks
    InstructorRepository mockInstructorRepository;


    @Test
    void findAll() {
        List<Instructor> instructors  = new ArrayList<>();

        Mockito.when(mockInstructorService.findAll()).thenReturn(instructors);
        //when
        instructors = instructorController.findAll().getBody();

        //then
        assertNotNull(instructors);
    }

    @Test
    void saveInstructors() {
    }

    @Test
    void deleteInstructorById() {
        mockInstructorRepository.deleteById(1000);
        //when
        assertEquals(true, mockInstructorRepository.findInstructorById(1000).isEmpty());
    }

    @Test
    void findInstructorById() {
       Instructor instructor = new Instructor();
        instructor.setId(5);
        List<Instructor> instructors = new ArrayList<>();
        instructors.add(instructor);

        lenient().when(mockInstructorRepository.findInstructorById(5)).thenReturn(instructors);
        Instructor expected = mockInstructorService.findById(5);
        assertEquals(expected, instructor);
    }

    @Test
    void getInstructorsWithName() {
        Instructor instructor = new Instructor();
        instructor.setName("Ali");
        List<Instructor> instructors = new ArrayList<>();
        instructors.add(instructor);

        Mockito.when(mockInstructorService.getInstructorsWithName(Mockito.any())).thenReturn(instructors);

        Instructor expected = (Instructor) instructorController.getInstructorsWithName("Ali");

        assertEquals(expected, instructor);


    }


}