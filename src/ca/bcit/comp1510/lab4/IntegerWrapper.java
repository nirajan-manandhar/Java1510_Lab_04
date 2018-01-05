/**
 * 
 */
package ca.bcit.comp1510.lab4;
import java.util.Scanner;

/**
 * Integer Wrapper.
 * Conversion of Integers
 * @author nirajanmanandhar
 * @version 1.0
 *
 */
public class IntegerWrapper {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("Please enter an integer.");
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        //This prints out the int.
        System.out.println("The integer is: " + num);
        
        //This prints out the int in binary.
        System.out.println("The integer in binary is: " 
        + Integer.toBinaryString(num));
        
        //This prints out the int in octal.
        System.out.println("The integer in octal is: " 
        + Integer.toOctalString(num)); 
        
        //This prints out the int in hex.
        System.out.println("The integer in hex is: " 
        + Integer.toHexString(num));
        
        System.out.println("The maximum value is :" + Integer.MAX_VALUE);
        System.out.println("The minimum value is :" + Integer.MIN_VALUE);
        
        
        
        System.out.println("Enter two decimal integers, one per line.");
        
        String num1 = scan.next();
        int number1 = Integer.parseInt(num1);
        System.out.println("You chose the first number to be: " + number1);

        String num2 = scan.next();
        int number2 = Integer.parseInt(num2);
        System.out.println("You chose the second number to be: " + number2);
        
        System.out.println("The numbers added are: " + (number1 + number2));
        
        scan.close();
        
    }

}
