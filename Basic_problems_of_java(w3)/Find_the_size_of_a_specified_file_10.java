//QUESTION-->
//Write a Java program to find the size of a specified file.

//ANSWER-->
import java.io.File;

public class Find_the_size_of_a_specified_file_10{
    public static void main(String[] args){
        System.out.print("mehul.txt = " + new File("mehul.txt").length()+" bytes");
    }
}