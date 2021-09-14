package dev.patika.hw05.service;

import dev.patika.hw05.model.Instructor;
import dev.patika.hw05.model.Student;
import dev.patika.hw05.repository.InstructorRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InstructorServiceTest {

    @Mock
    InstructorRepository mockInstructorRepository;

    @InjectMocks
    InstructorService instructorService;

    @Test
    void findAll() {
        Instructor instructor = new Instructor();
        List<Instructor> instructors  = new ArrayList<>();
        instructors.add(instructor);

        Mockito.when(mockInstructorRepository.findAll()).thenReturn(instructors);
        instructors = instructorService.findAll();

        assertNotNull(instructors);

    }

    @Test
    void findById() {
        Instructor ins = new Instructor();
        ins.setId(5);
        List<Instructor> inss = new ArrayList<>();
        inss.add(ins);


        instructorService.findById(5);

        assertNotNull(inss);
    }

    @Test
    void save() {
    }

    @Test
    void deleteById() {
        Instructor ins = new Instructor();
        ins.setId(1000);
        List<Instructor> inss = new ArrayList<>();
        inss.add(ins);

        Mockito.when(mockInstructorRepository.findInstructorById(1000)).thenReturn(inss);
        //when
        this.instructorService.deleteById(1000);

        assertNull(ins);
    }
}