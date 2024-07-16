//QUESTION-->
//Write a Java program and compute the sum of an integer's digits.

//ANSEWER-->
import java.util.Scanner;

public class Sum_of_digits_6{

    public static void main(String[] args) {
        //Accepting number from user
        Scanner data = new Scanner(System.in);

        System.out.println("Enter your number = ");
    int userinput=data.nextInt();

    System.out.println("The sum of the digits is: " + sumofdigit(userinput));
    }


    public static int sumofdigit(int userinput){
        //Calculation of sum of digits
    int sum=0;
     while(userinput!=0){
        int remainder=userinput%10;
        sum=sum+remainder;
       userinput/=10;
     }
     //returning values
     return sum;
    }
  
}