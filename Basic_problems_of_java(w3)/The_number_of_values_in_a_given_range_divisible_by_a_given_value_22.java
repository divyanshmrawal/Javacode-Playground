//QUESTION-->
//Write a Java program to find the number of values in a given range divisible by a given value.
//For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p

//ANSWER-->
import java.util.Scanner;
public class The_number_of_values_in_a_given_range_divisible_by_a_given_value_22{
    public static void main(String[] args){

        //Accepting numbers from user
        Scanner data=new Scanner(System.in);
        System.out.print("Enter your 1st number = ");
        int a1=data.nextInt();
        System.out.print("Enter your 2nd number = ");
        int a2=data.nextInt();
        System.out.print("Enter your 3rd number = ");
        int a3=data.nextInt();
        data.close();

        //Counting of numbers of values in a given range divisible by a given values
        int sum=0;
        for(int i=a1;i<=a2;i++){
            if(i%a3==0){
             sum=sum+1;
            }
        }
        //printing result 
        System.out.println("Number of values in a given range divisible by a given values = "+sum);
    }
}