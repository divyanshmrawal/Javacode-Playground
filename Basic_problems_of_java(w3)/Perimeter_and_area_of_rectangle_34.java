//QUESTION-->
//Write a Java program to print the area and perimeter of a rectangle.

//ANSWER-->
import java.util.Scanner;

public class Perimeter_and_area_of_rectangle_34{
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);

    //Accepting width and height of rectangle
    System.out.print("Enter width of rectangle = ");
    double width=data.nextDouble();

    System.out.print("Enter height of rectangle = ");
    double height=data.nextDouble();

        data.close();

    //Calculating area and perimater of rectangle
        double area=width*height;
        double perimeter=2*(width+height);

    //Printing area and perimeter of rectangle
        System.out.println("Area of rectangle = "+area);
        System.out.println("Perimeter of rectangle = "+perimeter);

    }
}