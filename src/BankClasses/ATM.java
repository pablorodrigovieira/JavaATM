package BankClasses;

/**
 *
 * @author Pablo
 * Class ATM has the checkAmountByNotes() Method that return true if the amount entered can be withdrawn
 */
public class ATM {
    //Attributes of the class ATM
    private int _20note;
    private int _50note;
    private int _100note;
    private float remainder;
    private float amountWithdraw;
            
    //Constructor
    public ATM(){
        _20note = 0;
        _50note = 0;
        _100note = 0;
        remainder = 0;
    }  
         
    /**
     * Method that check amount entered by the user, 
     * @param amount 
     * @return  true if amount is OK otherwise return false
     */
    public boolean checkAmountByNotes(float amount){ 
        amountWithdraw = amount; //keep value to print at the end.
        
        if(amount%20 != 0){
            _20note = (int) (amount/20);  
            remainder = _20note*20;
            amount = amount - remainder; 
            
            while(amount!=0 || _20note >= 5){
                if(_20note >= 1){
                    _20note -=1;
                    amount +=20;

                    if(amount >= 50){
                        _50note++;
                        amount -= 50;    
                    }
                    if(_50note == 2){
                        _50note-=2;
                        _100note++;
                    }
                }
                else{
                    amount = 0;
                    _20note = 0;
                    _50note = 0;
                    _100note = 0;
                }
            }
        }        
        else if(amount >= 100){
            _100note = (int) (amount/100);
            remainder = _100note*100;
            amount = amount - remainder;
            if(amount == 50){
              _50note = (int) (amount/50);  
              remainder = _50note*50;
              amount = amount - remainder;
            }
            if(amount>=20 && amount <= 80){
              _20note = (int) (amount/20);  
              remainder = _20note*20;
              amount = amount - remainder;
            }
        }
        else if(amount == 50){
            _50note = (int) (amount/50);  
            remainder = _50note*50;
            amount = amount - remainder;              
            if(amount>=20 && amount <= 80){
                _20note = (int) (amount/20);  
                remainder = _20note*20;
                amount = amount - remainder;
            }
        }
        else if(amount >= 20 && amount <= 80){
              _20note = (int) (amount/20);  
              remainder = _20note*20;
              amount = amount - remainder;
        }
        if(_20note != 0 || _50note != 0 || _100note != 0){
            //Copy to Constants
            Helper.Constants._20note = _20note; 
            Helper.Constants._50note = _50note; 
            Helper.Constants._100note = _100note; 
            return true;
        }   
        else{
            return false;
        }
    }
}
