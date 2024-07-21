//QUESTION-->
//Write a Java program to extract the first half of a even string.

//ANSWER-->
import java.util.*;

public class Extract_the_first_half_of_a_string_of_even_length_38{
public static void main(String[] args){

    //Accepting userinput
    Scanner data=new Scanner(System.in);
    System.out.println("Enter your text = ");
    String main_string=data.nextLine();
    data.close();
    
    //creating half string from full string
    String half_string=main_string.substring(0,main_string.length()/2);

    //Printing half string
    if(main_string.length()%2==0){
    System.out.println("Main String = "+main_string);
    System.out.println("Half String = "+half_string);
    }

    else{
        System.out.println("Invalid text.");
    }
}
}