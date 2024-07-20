//QUESTION-->
// Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.

//ANSWER-->
import java.util.*;
public class Calculate_the_module_of_two_numbers_without_using_any_inbuilt_modulus_operator_29 {
    public static void main(String[] args) {

        //Accepting 2 numbers from user
        Scanner data = new Scanner(System.in);
        System.out.print("Enter your numbers = ");
        int num1 = data.nextInt();

        System.out.print("Enter your numbers = ");
        int num2 = data.nextInt();
        data.close();

        //Calculating remainder
        int remainder=num1-((num1/num2)*num2);

        //printing result
        System.out.println("Remainder = "+remainder);
    }
}