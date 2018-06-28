package Helper;
import Bank.*;

/**
 *  Class with methods to display the screens
 * 
 * @author Pablo
 */
public class displayScreens {
    
    public void openMainUI(){
        //Open Main Screen
        AITBankUI UI = new AITBankUI();

        //Center on the middle of the Screen
        UI.pack();
        UI.setLocationRelativeTo(null);

        UI.setVisible(true);
    }
    
    
    public void openLoginUI(){
        //Open Main Screen
        AITBankLoginUI UI = new AITBankLoginUI();

        //Center on the middle of the Screen
        UI.pack();
        UI.setLocationRelativeTo(null);

        UI.setVisible(true);
    }
    
    public void openAccountUI(){
        //Open Main Screen
        AITBankAccount UI = new AITBankAccount();

        //Center on the middle of the Screen
        UI.pack();
        UI.setLocationRelativeTo(null);

        UI.setVisible(true);
    }
    
    
    public void openBalanceUI(){
        //Open Main Screen
        AITBankBalance UI = new AITBankBalance();

        //Center on the middle of the Screen
        UI.pack();
        UI.setLocationRelativeTo(null);

        UI.setVisible(true);
    }
    
    
    public void openDepositUI(){
        //Open Main Screen
        AITBankDeposit UI = new AITBankDeposit();

        //Center on the middle of the Screen
        UI.pack();
        UI.setLocationRelativeTo(null);

        UI.setVisible(true);
    }
    
    public void openWithdrawUI(){
        //Open Main Screen
        AITBankWithdraw UI = new AITBankWithdraw();

        //Center on the middle of the Screen
        UI.pack();
        UI.setLocationRelativeTo(null);

        UI.setVisible(true);
    }
    
    public void openWithdrawLimitUI(){
        //Open Main Screen
        AITBankWithdrawLimit UI = new AITBankWithdrawLimit();

        //Center on the middle of the Screen
        UI.pack();
        UI.setLocationRelativeTo(null);

        UI.setVisible(true);
    }
        
}
