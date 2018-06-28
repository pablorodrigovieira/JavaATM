package BankClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pablo Vieira (5527)
 * Cheque Account
 * Cheque account has no daily withdrawal limit.
 */

public class Cheque_Account extends Account{
    /**
     Method that make withdraw on Cheque Account
     * @return -1 insufficient funds 
     * @throws SQLException NumberFormatException Exception 
     
     */
    @Override
    public int makeWithdraw() throws SQLException, NumberFormatException, Exception{
        try{
            balance();
            balance = Float.parseFloat(Helper.Constants.ChequeBalance);
            amount =  Float.parseFloat(Helper.Constants.withdrawAmount);
            
            if(balance >= amount)
            {
                String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
                Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");

                String makeWithdraw = "UPDATE CUSTOMERACCOUNT SET BALANCE = (BALANCE -"+Helper.Constants.withdrawAmount+") WHERE ACCOUNTID = "+Helper.Constants.ChequeID+" AND CUSTOMERID = "+Helper.Constants.UserID;

                Statement st = conn.createStatement();
                rowAffected = st.executeUpdate(makeWithdraw);
                st.close();
                conn.close();

                return rowAffected;
            }
            else{
                return -1; //return -1 insufficient funds
            }
        }
        catch(SQLException ex){
            throw ex;
        }
        catch(NumberFormatException ex){
            throw ex;
        }
        catch(Exception ex){
            throw ex;
        }       
    }
    
    
      /**
     Method that make deposit on Cheque Account
     * @return rowAffected
       @throws SQLException NumberFormatException Exception
     */
    @Override
    public int makeDeposit()throws SQLException, NumberFormatException, Exception{
        try{
            String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
            Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");
            
            String makeDeposit = "UPDATE CUSTOMERACCOUNT SET BALANCE = (BALANCE +"+Helper.Constants.depositAmount+") WHERE ACCOUNTID = "+Helper.Constants.ChequeID+" AND CUSTOMERID = "+Helper.Constants.UserID;
            
            Statement st = conn.createStatement();
            rowAffected = st.executeUpdate(makeDeposit);
            st.close();
            conn.close();
            
            return rowAffected;
            
        }
        catch(SQLException ex){
            throw ex;
        }
        catch(NumberFormatException ex){
            throw ex;
        }
        catch(Exception ex){
            throw ex;
        }   
    }
    
      
     /**
     Method that load balance  
     * @throws java.sql.SQLException NumberFormatException Exception
     */
    @Override
    public void balance()throws SQLException, NumberFormatException, Exception{
        try{
            String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
            Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");

            String sqlCheque = "SELECT BALANCE FROM CUSTOMERACCOUNT WHERE ACCOUNTID = "+Helper.Constants.ChequeID+" AND CUSTOMERID = "+Helper.Constants.UserID;
            
            Statement st = conn.createStatement();

            //Cheque LOAD    
            ResultSet rsCheque = st.executeQuery(sqlCheque);            
            while (rsCheque.next()){
                Helper.Constants.ChequeBalance = rsCheque.getString("BALANCE");
            }
            rsCheque.close();
            st.close();
            conn.close();
                            
        }
        catch(SQLException ex){
            throw ex;
        }
        catch(NumberFormatException ex){
            throw ex;
        }
        catch(Exception ex){
            throw ex;
        }
    }
        
}
