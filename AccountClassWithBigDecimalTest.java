//Account class BigDecimal test
package AccountClassWithBigDecimalBalance819;
import java.math.BigDecimal;
import java.util.Scanner;

public class AccountClassWithBigDecimalTest {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(50.00);
        BigDecimal b = new BigDecimal(-7.53);

        //create two account objects
        AccountClassWithBigDecimalBalance account1 = new AccountClassWithBigDecimalBalance("Jane Green", a);
        AccountClassWithBigDecimalBalance account2 = new AccountClassWithBigDecimalBalance("John Blue", b);

        //display initial balance of each object
        System.out.printf("%s balance: $%.2f%n", 
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", 
                account2.getName(), account2.getBalance());

        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); //prompt
        BigDecimal depositAmount = new BigDecimal(input.nextDouble()); //obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n", 
                depositAmount);
        account1.deposit(depositAmount); //add to account1's balance

        //display balances
        System.out.printf("%s balance: $%.2f%n", 
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", 
                account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); //prompt
        depositAmount = input.nextBigDecimal(); //obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount); //add to account2 balance

        //display balances
        System.out.printf("%s balance: $%.2f%n", 
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", 
                account2.getName(), account2.getBalance());
    }
}
