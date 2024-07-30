//QUESTION-->
//Write a java program to get sum of digits of the given number

//ANSWER-->
import java.util.*;
public class Reduce_Integer_to_Single_Digit_Sum__71{
    public static void main(String[] args){
    Scanner data=new Scanner(System.in);
    System.out.print("Enter your number = ");
    int userinput=data.nextInt();
    data.close();

    int count=0;

    while (userinput>=1) {
    int remainder=userinput%10;
    userinput=userinput/10;
    count=count+remainder;
    }

    System.out.print("Sum of digits of number = "+count);
    }
}