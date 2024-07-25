//QUESTION-->
//Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1.

//ANSWER-->
import java.util.*;
public class Iterative_Process_for_n_to_one_Transformation {

    public static void main(String[] args){
        //Accepting userinput
        Scanner data=new Scanner(System.in);
        System.out.print("Enter your number = ");
        int userinput=data.nextInt();
        data.close();

        //while loop to solve problem
        while (userinput!=1) {
            
            if (userinput%2==0) {
                userinput=userinput/2;
            }

            else if(userinput%2!=0){
                userinput=userinput*3+1;
            }
        }

        //Printing userinput
        System.out.println("userinpuut = "+userinput);
    }
}