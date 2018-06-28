package BankClasses;

import java.sql.SQLException;

/**
 *
 * @author Pablo Vieira (5527)
 * 
 */

public abstract class Account {
    
    //Attributes of class Account
    protected int rowAffected;
    protected float balance;
    protected float amount;

    /**
     Method that make deposit
     * @return rowAffected
     * @throws java.sql.SQLException NumberFormatException Exception
     */
    public abstract int makeDeposit() throws SQLException, NumberFormatException, Exception;
    
    /**
     * Method to make withdraw
     * @return      
     * return 2: Withdraw Limit exceed   
       return -1: Insufficient funds
     * @throws java.sql.SQLException NumberFormatException Exception
     */
    public abstract int makeWithdraw() throws SQLException, NumberFormatException, Exception;
    
    /**
     *
     * Method to print account balance
     * @throws java.sql.SQLException NumberFormatException Exception
     */
    public abstract void balance()throws SQLException, NumberFormatException, Exception;
 
}

