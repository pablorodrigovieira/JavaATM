package Exceptions;

/**
 * Custom Exception for Zero Input
 * @author Pablo
 */
public class ZeroInputExcepetion extends Exception{

    public ZeroInputExcepetion() {
        super("Amount must be greater than Zero.");
    }
    
}
