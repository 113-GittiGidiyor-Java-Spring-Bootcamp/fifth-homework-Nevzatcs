package dev.patika.hw05.exceptions;

public class StudentAgeNotValidException extends  RuntimeException{
    public StudentAgeNotValidException(String msg){
        super(msg);
    }
}
