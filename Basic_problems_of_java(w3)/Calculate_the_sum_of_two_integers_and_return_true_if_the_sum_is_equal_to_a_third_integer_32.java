//QUESTION-->
// Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer

//ANSWER-->
import java.util.Scanner;
public class Calculate_the_sum_of_two_integers_and_return_true_if_the_sum_is_equal_to_a_third_integer_32{
    public static void main(String[] args){
        //Accepting 3 numbers from user
        Scanner data=new Scanner(System.in);
        System.out.print("Enter your 1st number = ");
        int a1=data.nextInt();
        System.out.print("Enter your 2nd number = ");
        int a2=data.nextInt();
        System.out.print("Enter your 3rd number = ");
        int a3=data.nextInt();   
        data.close();

        //Checking given condition and printing result 
        if(a1+a2==a3){
            System.out.println("Entered number is correct.");
        }
        else{
            System.out.println("Entered number is incorrect.");
        }
    }
}