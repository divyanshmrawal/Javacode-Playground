//QUESTION-->
//Write a Java program to reverse a string.

//ANSWER-->
import java.util.Scanner;
public class Reverse_a_string_7 {
    public static void main(String[] args) {
        //Accepting string from user
        Scanner data=new Scanner(System.in);
        System.out.print("Enter your string= ");
        char[] letters = data.nextLine().toCharArray();
        data.close();

        //printing string in simple order
       System.out.print("Simple order of string = ");
       for(int j=0;j<letters.length;j++){
        System.out.print(letters[j]);
       }

System.out.print("\n");

// //printing string in order order
        System.err.print("Reverse order of string = ");
        for(int i=letters.length-1;i>=0;i--){
        System.out.print(letters[i]);
    }
    }
}