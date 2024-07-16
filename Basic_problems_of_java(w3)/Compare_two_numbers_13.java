//QUESTION-->
//Write a Java program to compare two numbers.

//ANSWER-->
import java.util.Scanner;
public class Compare_two_numbers_13{
    public static void main(String[] args){
        //Accepting two numbers from user
    Scanner data=new Scanner(System.in);

    System.out.print("Enter your 1st number = ");
    int num1=data.nextInt();
    
    System.out.print("Enter your 2nd number = ");
    int num2=data.nextInt();
    data.close();
   
    //Comparing 2 usersinputs and printing result
    if(num1==num2){
        System.out.println(num1+"="+num2);
    }

     if(num1>num2){
        System.out.println(num1+">"+num2);
    }
 
     if(num1<num2){
        System.out.println(num1+"<"+num2);
    }

     if(num1<=num2){
        System.out.println(num1+"<="+num2);
    }

     if(num1>=num2){
        System.out.println(num1+">="+num2);
    }

     if(num1!=num2){
        System.out.println(num1+"!="+num2);
    }

   }
}