//QUESTION-->
//Write a Java program to create a string in the form of short_string + long_string + short_string from two strings. The strings must not have the same length

//ANSWER-->
import java.util.*;
public class The_concatenation_of_the_two_strings__44{
    public static void main(String[] args){

        //Accepting text from userinput
    Scanner data=new Scanner(System.in);
    System.out.println("Enter your 1st text = ");
    String text1=data.nextLine();

    System.out.println("Enter your 2nd text = ");
    String text2=data.nextLine();
    data.close();

    //updating userinput
    String textn1=text1.substring(1,text1.length());
    String textn2=text2.substring(1,text2.length());

    //printing result
    System.out.println(textn1+textn2);
    }
}