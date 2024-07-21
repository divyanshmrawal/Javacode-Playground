//QUESTION-->
//Write a java program to calculate product of userinput

//ANSWER-->
import java.util.Scanner;

public class Product_of_userinput_39{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter 1st number = ");
        int num1=input.nextInt();

        System.out.println("Enter 2nd number = ");
        int num2=input.nextInt();

        input.close();

        System.out.println("Product of two numbers is = "+(num1*num2));
        
    }
}