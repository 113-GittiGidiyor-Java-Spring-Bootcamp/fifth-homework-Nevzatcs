package dev.patika.hw05.exceptions;

public class InstructorAlreadyExistsException  extends RuntimeException {
    public InstructorAlreadyExistsException(String msg){
        super(msg);
    }

}