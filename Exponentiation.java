//Calculate a base raised to an exponent
package Exponentiation614;
import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        int base;
        int exponent;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base integer: ");
        base = input.nextInt();
        System.out.print("Enter the exponent: ");
        exponent = input.nextInt();
        
        System.out.printf("(%d)^%d = %d%n", base, exponent, 
                integerPower(base, exponent));
    }
    
    public static int integerPower(int base, int exponent) {
        int product = 1;
        
        while (exponent > 0) {
            product *= base;
            exponent--;
        }
        
        return product;
    }
}
