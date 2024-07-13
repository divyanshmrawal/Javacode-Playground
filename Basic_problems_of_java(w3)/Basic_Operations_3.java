//QUESTION-->
//Write a java program to get basic calculation results of 2 numbers 

//ANSWER-->
//importing Scanner to get userinput from user
import java.util.Scanner;

//Creating class 
public class Basic_Operations_3{

    public static void main(String[] args){
        //Accpting userinput
        Scanner userinput=new Scanner(System.in);

        System.out.print("Enter 1st number = ");
        int num1=userinput.nextInt();

System.out.println(" ");

        System.out.print("Enter 2nd number = ");
        int num2=userinput.nextInt();

    userinput.close();
      
    //Basic Calculation
    int add=num1+num2;
    int sub=num1-num2;
    int multip=num1*num2;
    float div=(float)num1/num2;
    float mod=(float)num1%num2;

    //Printing values of basic operations
    
    System.out.println("Addition of numbers = "+add);
    System.out.println("Substraction of numbers = "+sub);
    System.out.println("Multiplication of numbers = "+multip);
    System.out.println("Division of numbers = "+div);
    System.out.println("remainder of numbers = "+mod);

    }
}