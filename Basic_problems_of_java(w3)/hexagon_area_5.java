//QUESTION-->
//Write a Java program to compute hexagon area

//ANSWER-->
import java.util.Scanner;
//Calculation to find the area of Hexagon 
public class hexagon_area {

    public static double calculation(double s){
     double area=(6*s*s)/(4*(Math.tan(Math.PI/6)));
     return area;
    }

    public static void main(String[] args) {
        //Accepting length of Hexagon 
        Scanner data=new Scanner(System.in);

        System.out.println("Enter length of hexagon = ");
       double s=data.nextDouble();
        data.close();

        //Printing Area of Hexagon
        System.out.println("Area of Hexagon is = "+calculation(s));
    }
}