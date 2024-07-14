//QUESTION-->
//Write a java_program to get a table of given number

//ANSWER-->
import java.util.Scanner;
//Accepting userinput 
public class Table_4{
    public static void main(String[] args) {
        Scanner userinput=new Scanner(System.in);

        System.out.print("Enter your Number = ");
    int user_input=userinput.nextInt();

    userinput.close();
  //Printing table of given number
    System.out.println("Table:--");
     
    for(int i=0;i<=10;i++){
        System.out.println(user_input+" * "+i+" = "+(user_input*i));
    }
    }
}