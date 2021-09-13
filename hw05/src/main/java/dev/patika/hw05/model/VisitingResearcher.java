package dev.patika.hw05.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

// implemented according to requirements
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity



public class VisitingResearcher extends Instructor{

    private double hourlySalary;


}