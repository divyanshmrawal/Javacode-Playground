//QUESTION-->
//Write a java program to Return true if the 2nd num is greater than 1st num and 3rd num is greater than 2nd num

//ANSWER-->
import java.util.Scanner;
public class Return_true_if_the_2nd_num_is_greater_than_1st_num_and_3rd_num_is_greater_than_2nd_num_20 {

    public static void main(String[] args){

        //Accepting numbers from user
    Scanner data=new Scanner(System.in);
    System.out.println("Enter your 1st number = ");
    int a1=data.nextInt();
    System.out.println("Enter your 1st number = ");
    int a2=data.nextInt();
    System.out.println("Enter your 1st number = ");
    int a3=data.nextInt();
    data.close();

    //Printing result
    if(a1>a2 && a2>a3){
        System.out.println("your number are correct");
    }
    else {
        System.out.println("Your numbers are incorrect");
    }
    }
}