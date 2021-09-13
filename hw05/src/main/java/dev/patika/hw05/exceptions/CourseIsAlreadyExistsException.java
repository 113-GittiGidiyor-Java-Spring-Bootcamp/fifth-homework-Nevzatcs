package dev.patika.hw05.exceptions;

public class CourseIsAlreadyExistsException extends RuntimeException {
    public CourseIsAlreadyExistsException(String msg){
        super(msg);
    }
}

