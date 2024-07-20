//QUESTION-->
//Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers.

//ANSWER-->
import java.util.*;
public class Return_true_if_there_is_a_common_digit_in_both_numbers_28{
    public static void main(String[] args){

    //Accepting number from user
    Scanner data=new Scanner(System.in);
    System.out.print("Enter your 1st number = ");
    int num1=data.nextInt();

    System.out.print("Enter your 2nd number = ");
    int num2=data.nextInt();
     data.close();

if(num1>25 && num2>25 && num1<75 && num2<75){
     //number-1
     int digit1_1=num1%10;
     int digit2_1=num1/10;

     //number-2
     int digit1_2=num2%10;
     int digit2_2=num2/10;

     //printing result
     if(digit1_1==digit1_2 || digit2_1==digit2_2){
        System.out.print("True");
     }
     else{
        System.out.print("False");
     }
    }
}
}