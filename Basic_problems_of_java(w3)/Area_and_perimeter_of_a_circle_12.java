//QUESTION-->
//Write a Java program to print the area and perimeter of a circle.

//ANSWER-->
public class Area_and_perimeter_of_a_circle_12{
    public static void main(String[] args){
//Calculating area and perameter of circle
      double radius=7.5;
       double area=(Math.PI)*(radius*radius);
       double perameter=2*(Math.PI)*radius;
//Printing values of area and perameter of circle
        System.out.println("Area of circle = "+area);
        System.out.println("perameter of circle = "+perameter);
    }
}