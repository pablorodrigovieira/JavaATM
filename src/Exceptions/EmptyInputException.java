package Exceptions;

/**
 * Custom Exception for Empty Input
 * @author Pablo 
 */
public class EmptyInputException extends Exception{
     
    public EmptyInputException(String message){
        super(message);
    }
}
