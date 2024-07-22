//QUESTION-->
//Write a Java program to create a string in the form of short_string + long_string + short_string from two strings. The strings must not have the same length.

//ANSWER-->
import java.util.*;
public class Arranged_words_43{
    public static void main(String[] args){

        //Accepting text from userinput
        Scanner data=new Scanner(System.in);
        System.out.print("Enter your 1st TEXT = ");
        String text1=data.nextLine();

        System.out.print("Enter your 2nd TEXT = ");
        String text2=data.nextLine();
        data.close();

        //Checking and printing result
        if(text1.length()<=text2.length()){
        System.out.println(text1 + text2 + text1);
        }
        
        if(text2.length()<=text1.length()){
            System.out.println(text2 + text1 + text2);
            }
    }
    
    
}