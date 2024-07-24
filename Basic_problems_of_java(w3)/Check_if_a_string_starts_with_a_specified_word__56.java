//QUESTION-->
// Write a Java program to check if a string starts with a specified word.

//ANSWER-->
import java.util.*;
public class Check_if_a_string_starts_with_a_specified_word__56{
    public static void main(String[] args){
        Scanner data=new Scanner(System.in);

        //Accepting text from user
        System.out.print("Enter your text = ");
        String text=data.nextLine();
        data.close();

        //printing result 
        System.out.println("Result = "+text.contains("Hello"));
    }
}