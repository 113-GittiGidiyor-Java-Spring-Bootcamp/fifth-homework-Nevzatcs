package dev.patika.hw05.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.xml.internal.ws.developer.Serialization;
import dev.patika.hw05.dto.CourseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

// implemented according to requirements
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity

//@SuperBuilder

public class Instructor extends AbstractBaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String address;
    private String phoneNumber;


    @OneToMany(mappedBy = "instructor")
    @JsonIgnore
    private List<Course> instructorCourse = new ArrayList<>();

    @Override
    public Course mapFromCourseDTOtoCourse(CourseDTO courseDTO) {
        return null;
    }





}