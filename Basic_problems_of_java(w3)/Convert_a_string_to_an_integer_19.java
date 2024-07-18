//QUESTION-->
//Write a Java program to convert a string to an integer

//ANSWER-->
import java.util.Scanner;
public class Convert_a_string_to_an_integer_19 {

    public static void main(String[] args){
        //Accepting userinput in the form of String
        Scanner data=new Scanner(System.in);
        System.out.print("Enter your number in the form of String : ");
        String num=data.nextLine();

        //Converting String to integer 
        int mynum=Integer.parseInt(num);

        //Printing userinput in the form of integers
        System.out.println("int number converted from string : "+mynum);
    }
}