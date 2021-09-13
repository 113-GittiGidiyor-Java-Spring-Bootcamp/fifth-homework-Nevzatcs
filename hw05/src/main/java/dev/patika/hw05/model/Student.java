package dev.patika.hw05.model;

import dev.patika.hw05.dto.CourseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// implemented according to requirements
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Student  extends AbstractBaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String s_name;
    private LocalDate s_birthDate;
    private String s_address;
    private String s_gender;

    @ManyToMany
    private List<Course> studentCourse = new ArrayList<>();


    @Override
    public Course mapFromCourseDTOtoCourse(CourseDTO courseDTO) {
        return null;
    }


}