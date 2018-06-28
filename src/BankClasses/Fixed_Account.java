package BankClasses;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pablo Vieira (5527)
 * 
 * Fixed Account
 * Fixed account has no daily withdraw limit.
 * 
 */

public class Fixed_Account extends Account{
    /**
     Method that make withdraw on Fixed Account
     * @return -1 insufficient funds 
     * @throws java.sql.SQLException NumberFormatException, Exception
     */
    @Override
    public int makeWithdraw() throws SQLException, NumberFormatException, Exception{
        try{
            balance();
            balance = Float.parseFloat(Helper.Constants.FixedBalance);
            amount =  Float.parseFloat(Helper.Constants.withdrawAmount);
            
            if(balance >= amount)
            {
                String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
                Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");

                String makeWithdraw = "UPDATE CUSTOMERACCOUNT SET BALANCE = (BALANCE -"+Helper.Constants.withdrawAmount+") WHERE ACCOUNTID = "+Helper.Constants.FixedID+" AND CUSTOMERID = "+Helper.Constants.UserID;

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
     Method that make deposit on Fixed Account
     * @return rowAffected
     * @throws java.sql.SQLException NumberFormatException, Exception
     */
    @Override
    public int makeDeposit()throws SQLException, NumberFormatException, Exception{
        try{
            String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
            Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");
            
            String makeDeposit = "UPDATE CUSTOMERACCOUNT SET BALANCE = (BALANCE +"+Helper.Constants.depositAmount+") WHERE ACCOUNTID = "+Helper.Constants.FixedID+" AND CUSTOMERID = "+Helper.Constants.UserID;
            
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
     * @throws java.sql.SQLException NumberFormatException, Exception
     */
    @Override
    public void balance()throws SQLException, NumberFormatException, Exception{
        try{
            String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
            Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");

            String sqlFixed = "SELECT BALANCE FROM CUSTOMERACCOUNT WHERE ACCOUNTID = "+Helper.Constants.FixedID+" AND CUSTOMERID = "+Helper.Constants.UserID;
            
            Statement st = conn.createStatement();

            //Fixed LOAD    
            ResultSet rsFixed = st.executeQuery(sqlFixed);            
            while (rsFixed.next()){
                Helper.Constants.FixedBalance = rsFixed.getString("BALANCE");
            }
            rsFixed.close();
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
