//QUESTION-->
//Write a java program to find average of given 5 numbers

//ANSWER-->
import java.util.Scanner;

public class Finding_Average_33{
 public static void main(String[] args) {

    //Accepting userinput numbers from user
    Scanner userinput=new Scanner(System.in);

   System.out.println("Enter your 1 number :-- ");
   int num1=userinput.nextInt();
   System.out.println("Enter your 2 number :-- ");
   int num2=userinput.nextInt();
   System.out.println("Enter your 3 number :-- ");
   int num3=userinput.nextInt();
   System.out.println("Enter your 4 number :-- ");
   int num4=userinput.nextInt();
   System.out.println("Enter your 5 number :-- ");
   int num5=userinput.nextInt();

    userinput.close();

    //Adding number of values
    int sum=num1+num2+num3+num4+num5;
    //total numbers of values
    int length=5;
    //Finding average of values
    int average=sum/length;
    //Printing values of average of numbers
    System.out.println("Average of values is = "+average);

 }
    
}