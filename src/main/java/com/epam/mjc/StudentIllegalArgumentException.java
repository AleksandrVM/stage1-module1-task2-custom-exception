package com.epam.mjc;

public class StudentIllegalArgumentException extends IllegalArgumentException{
    public StudentIllegalArgumentException(long studentID){
        super("Could not find student with ID " + studentID);
    }
    public StudentIllegalArgumentException(String message){
        super(message);
    }
    public StudentIllegalArgumentException(String message, Throwable cause){
        super(message, cause);
    }
}
