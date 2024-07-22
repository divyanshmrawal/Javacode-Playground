//QUESTION-->
// Write a Java program to create a string taking the first three characters from a given string. If the string length is less than 3 use "#" as substitute characters.

//ANSWER-->
import java.util.*;
public class String_taking_first_three_characters_from_a_given_string__45{
    public static void main(String[] args){

    //Accepting text from userinput
     Scanner data=new Scanner(System.in);
     System.out.print("Enter your text line = ");
     String text1=data.nextLine();       
     data.close();

     //Checking condition and printin result
     if(text1.length()>3){
        String textup1=text1.substring(0,3);
        System.out.print(textup1);
     }

     if(text1.length()==3){
        System.out.print("###");
     }

     if(text1.length()==2){
        System.out.print("##");
     }

     if(text1.length()==1){
        System.out.print("#");
     }
    }
}