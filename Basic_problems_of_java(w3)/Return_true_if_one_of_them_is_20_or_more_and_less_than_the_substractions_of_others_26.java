//QUESTION-->
//Write a Java program that accepts three integer values and returns true if one is 20 or more less than the others' subtractions.

//ANSWER-->
import java.util.*;
public class Return_true_if_one_of_them_is_20_or_more_and_less_than_the_substractions_of_others_26 {

    public static void main(String[] args) {
        //Accepting numbers from user
        Scanner data=new Scanner(System.in);
        System.out.println("Enter your 1st number = ");
        int num1=data.nextInt();

        System.out.println("Enter your 2nd number = ");
        int num2=data.nextInt();

        System.out.println("Enter your 3rd number = ");
        int num3=data.nextInt();

        data.close();

        //Checking condition and printing result
        if(Math.abs(num1-num2)>=20 || Math.abs(num2-num3)>=20 || Math.abs(num3-num1)>=20){
        System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}