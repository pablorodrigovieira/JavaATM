package BankClasses;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Pablo Vieira (5527)
 * Savings Account
 * Savings account have daily withdrawal limits. 
 * Users can set their own withdrawal limit.

 */
public class Savings_Account extends Account{  
     /**
     Method that make deposit on Savings Account
     * @return rowAffected or Zero
     @throws java.sql.SQLException NumberFormatException, Exception
     */
    @Override
    public int makeDeposit()throws SQLException, NumberFormatException, Exception{
        try{
            String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
            Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");
            
            String makeDepositSavigns = "UPDATE CUSTOMERACCOUNT SET BALANCE = (BALANCE +"+Helper.Constants.depositAmount+") WHERE ACCOUNTID = "+Helper.Constants.SavignsID+" AND CUSTOMERID = "+Helper.Constants.UserID;
            
            Statement st = conn.createStatement();
            rowAffected = st.executeUpdate(makeDepositSavigns);
            st.close();
            conn.close();
            
            return rowAffected;
            
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
     Method that make withdraw on Savings Account
     * @return 2 Withdraw Limit exceed   
        return -1 insufficient funds
        * @throws java.sql.SQLException NumberFormatException, Exception
     */
    @Override
    public int makeWithdraw()throws SQLException, NumberFormatException, Exception{
        try{
            balance();
            loadWithDrawlimit();
            balance = Float.parseFloat(Helper.Constants.SavingsBalance);
            amount =  Float.parseFloat(Helper.Constants.withdrawAmount);
            
            //Daily withdraw keeps tracking only when program is running;
            Helper.Constants.dailyWithdraw = Helper.Constants.dailyWithdraw + amount; 
            
            if(balance >= amount)
            {
                if(Helper.Constants.dailyWithdraw <= Float.parseFloat(Helper.Constants.WithdrawLimit)){
                    String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
                    Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");

                    String makeWithdraw = "UPDATE CUSTOMERACCOUNT SET BALANCE = (BALANCE -"+Helper.Constants.withdrawAmount+") WHERE ACCOUNTID = "+Helper.Constants.SavignsID+" AND CUSTOMERID = "+Helper.Constants.UserID;

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
     Method that load balance  
     * @throws java.sql.SQLException NumberFormatException, Exception
     */
    @Override
    public void balance()throws SQLException, NumberFormatException, Exception{
        try{
            String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
            Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");

            String sqlSavigns = "SELECT BALANCE FROM CUSTOMERACCOUNT WHERE ACCOUNTID = "+Helper.Constants.SavignsID+" AND CUSTOMERID = "+Helper.Constants.UserID;
            
            Statement st = conn.createStatement();

            //Savigns LOAD            
            ResultSet rsSavigns = st.executeQuery(sqlSavigns);
            while (rsSavigns.next()){
                Helper.Constants.SavingsBalance = rsSavigns.getString("BALANCE");
            }
            rsSavigns.close();
            st.close();
            conn.close();
                            
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
    
    //load current withdraw limit
    public void loadWithDrawlimit()throws SQLException, NumberFormatException, Exception{
        try{
            String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
            Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");

            String sql = "SELECT WITHDRAWLIMIT FROM CUSTOMERACCOUNT WHERE ACCOUNTID = "+Helper.Constants.SavignsID+" AND CUSTOMERID = "+Helper.Constants.UserID;
            
            Statement st = conn.createStatement();

            //Fixed LOAD    
            ResultSet rs = st.executeQuery(sql);            
            while (rs.next()){
                Helper.Constants.WithdrawLimit = rs.getString("WITHDRAWLIMIT");
            }
            rs.close();
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
