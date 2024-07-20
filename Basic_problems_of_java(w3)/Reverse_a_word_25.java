//QUESTION-->
//Write a Java program to reverse a word

//ANSWER-->
import java.util.*;
public class Reverse_a_word_25{
    public static void main(String[] args){

        //Accepting text from userinput
        Scanner data=new Scanner(System.in);
        System.out.print("Enter your text = ");
        String line=data.nextLine();
        data.close();

        //Converting words to characters
        char[] chrt=line.toCharArray();

        //Printing character in reverse order
        System.out.print("Reverse a word = ");
        for(int i=chrt.length-1;i>=0;i--){
            System.out.print(chrt[i]);
        }
    }
}