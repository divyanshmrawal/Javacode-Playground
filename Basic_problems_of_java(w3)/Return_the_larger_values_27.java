//QUESTION-->
//Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.

//ANSWER-->
import java.util.*;
public class Return_the_larger_values_27{
    public static void main(String[] args){

        //Accepting 2 numbers from user
    Scanner data=new Scanner(System.in);

    System.out.print("Enter your 1st number = ");
    int num1=data.nextInt();

    System.out.print("Enter your 2nd number = ");
    int num2=data.nextInt();

    data.close();

    //Finding and printing maximum value 
    if(num1!=num2){
    int max=Math.max(num1,num2);
    System.out.print("Maximum value = "+max);
    }

    //If both numbers are same than printing (0)
    else if(num1==num2){
        System.out.print("0");
    }

    if (num1%6==num2%6){
        System.out.print(Math.min(num1,num2));
    }
    }
}