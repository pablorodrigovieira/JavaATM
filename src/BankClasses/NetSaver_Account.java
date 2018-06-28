package BankClasses;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pablo Vieira (5527)
 * Net Savings Account
 * They have a daily withdrawal limit but the user cannot set/change this limit.
 */

public class NetSaver_Account extends Account{
    /**
     Method that make deposit on NetSaver Account
     * @return rowAffected
     @throws java.sql.SQLException NumberFormatException, Exception
     */
    @Override
    public int makeDeposit()throws SQLException, NumberFormatException, Exception{
        try{
            String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
            Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");
            
            String makeDeposit = "UPDATE CUSTOMERACCOUNT SET BALANCE = (BALANCE +"+Helper.Constants.depositAmount+") WHERE ACCOUNTID = "+Helper.Constants.NetSaverID+" AND CUSTOMERID = "+Helper.Constants.UserID;
            
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
     Method that make withdraw on NetSaver Account
     * @return rowAffected
     * return 2  Withdraw Limit exceed
     * return -1 insufficient funds
     * @throws java.sql.SQLException NumberFormatException, Exception
     */
    @Override
    public int makeWithdraw()throws SQLException, NumberFormatException, Exception{
        try{
            balance();
            balance = Float.parseFloat(Helper.Constants.NetSaverBalance);
            amount =  Float.parseFloat(Helper.Constants.withdrawAmount);
            
            //Daily withdraw keeps tracking only when program is running;
            Helper.Constants.dailyWithdraw =  Helper.Constants.dailyWithdraw + amount;
            
            if(balance >= amount)
            {
                 if(Helper.Constants.dailyWithdraw <= Helper.Constants.WithdrawLimitNetSaver){
                    String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
                    Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");

                    String makeWithdraw = "UPDATE CUSTOMERACCOUNT SET BALANCE = (BALANCE -"+Helper.Constants.withdrawAmount+") WHERE ACCOUNTID = "+Helper.Constants.NetSaverID+" AND CUSTOMERID = "+Helper.Constants.UserID;

                    Statement st = conn.createStatement();
                    rowAffected = st.executeUpdate(makeWithdraw);
                    st.close();
                    conn.close();
                    
                    return rowAffected;
                }
                else
                    return 2; //return 2 Withdraw Limit exceed
            }
            else{
                return -1; //return -1 Insufficient funds
            } 
        }catch(SQLException ex){
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

            String sqlNetSaver = "SELECT BALANCE FROM CUSTOMERACCOUNT WHERE ACCOUNTID = "+Helper.Constants.NetSaverID+" AND CUSTOMERID = "+Helper.Constants.UserID;
            
            Statement st = conn.createStatement();

            //NetSaver LOAD    
            ResultSet rsNetSaver= st.executeQuery(sqlNetSaver);            
            while (rsNetSaver.next()){
                Helper.Constants.NetSaverBalance = rsNetSaver.getString("BALANCE");
            }
            rsNetSaver.close();
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
