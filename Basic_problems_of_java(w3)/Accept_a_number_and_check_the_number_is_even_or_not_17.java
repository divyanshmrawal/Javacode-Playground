//QUESTION
//Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the

//ANSWER-->
import java.util.*;
public class Accept_a_number_and_check_the_number_is_even_or_not_17{
    public static void main(String[] args){
        //Accepting numbers from user
      Scanner data=new Scanner(System.in);
      System.out.print("Enter your number = ");
      int userinput=data.nextInt();
      
      if(userinput%2==0){
        System.out.println("1");
      }
      else if(userinput%2!=0){
        System.out.println("0");
      }
    }
}