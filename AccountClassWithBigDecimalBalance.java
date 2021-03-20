//Modify Account class to use BigDecimal
package AccountClassWithBigDecimalBalance819;
import java.math.BigDecimal;

public class AccountClassWithBigDecimalBalance {
    private String name; //instance variable 
    private BigDecimal balance = new BigDecimal(5); //instance variable
    
    //Account constructor that receives two parameters
    public AccountClassWithBigDecimalBalance(String name, BigDecimal balance) {
        this.name = name; //assign name to instance variable name
        
        //validate that the balanceis greater than 0.0; if it's not,
        //instance variable balance keeps its default initial value of 0.0
        if (balance.compareTo(BigDecimal.ZERO) > 0) { //if the balance is valid
            this.balance = balance; //assign it to instance variable balance
        }
    }
    
    //method that deposits (adds) only a valid amount to the balance
    public void deposit(BigDecimal depositAmount) {
        if (depositAmount.compareTo(BigDecimal.ZERO) > 0) { //if the depositAmount is valid
            balance = balance.add(depositAmount); //add it to the balance
        }
    }
    
    //method returns the account balance
    public BigDecimal getBalance() {
        return balance;
    }
    
    //method that sets the name
    public void setName(String name) {
        this.name = name;
    }
    
    //method that returns the name
    public String getName() {
        return name;
    }
}
