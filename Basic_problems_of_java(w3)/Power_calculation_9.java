//QUESTION-->
//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

//ANSWER-->
import java.util.Scanner;
public class Power_calculation_9{
    public static void main(String[] args){
    //Accepting numbers from user_input
    Scanner data=new Scanner(System.in);
    System.out.print("Enter your number = ");
    int userinput=data.nextInt();
    data.close();

    //Presenting result
    System.out.printf("%d + %d%d + %d%d%d = ",userinput,userinput,userinput,userinput,userinput,userinput);
    double count=userinput+((userinput*10)+userinput)+((userinput*100)+(userinput*10)+userinput);
    System.out.println(count);
    }
}