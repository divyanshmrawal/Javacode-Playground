//QUESTION-->
// Write a Java program to find the penultimate (next to the last) word in a sentence.

//ANSWER-->
import java.util.*;
public class Find_the_penultimate_word_of_a_sentence_24{
    public static void main(String[] args){
        //Accepting text from user
    Scanner data=new Scanner(System.in);
    System.out.print("Enter your text = ");

    //Converting line to words
    String line=data.nextLine();
    String[] words = line.split("[ ]+");

    //Printing penultimate word
    System.out.println("Penultimate word = "+words[words.length-2]);
    }
}