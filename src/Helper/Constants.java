package Helper;

/**
 * Class that have Error messages, User Information, Flags and Notes
 * @author Pablo
 */
public final class Constants {
    //Error Messages
    public static final String LoginError = "Check your user information.";
    public static final String EmptyFieldError = "Enter the Amount first.";
    public static final String AmountError = "Check the Amount entered";
    
    //Account IDs
    public static int SavignsID = 1;
    public static int ChequeID = 2;
    public static int NetSaverID = 3;
    public static int FixedID = 4;
    
    //User Info
    public static String UserID;
    public static String WithdrawLimit = "$0.00";
    public static float  dailyWithdraw = 0.00f;
    public static float  WithdrawLimitNetSaver = 1000.00f; //$1000 as withdrawlimit 
    
    public static String SavingsBalance = "0.00"; 
    public static String ChequeBalance = "0.00";
    public static String NetSaverBalance = "0.00";
    public static String FixedBalance = "0.00";
    
    public static String depositAmount = "0.00";
    public static String withdrawAmount = "0.00";
    
    //FLAGS
    public static boolean isDeposit = false;
    public static boolean isWithdraw = false;
    
    //NOTES
    public static int _20note;
    public static int _50note;
    public static int _100note;
}
