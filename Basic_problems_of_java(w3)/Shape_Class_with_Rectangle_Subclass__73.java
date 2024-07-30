//QUESTION-->
//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

//ANSWER-->
public class Shape_Class_with_Rectangle_Subclass__73{
    //main method to print result
    public static void main(String[] args){
        //creating objects
        Rectangle rec=new Rectangle();
        double area = rec.getarea();
        //printing area
        System.out.println(area);
    }
}

// Creating class named shape
class Shape{
    public double getarea(){
        return 0.0;
    }
}

//creating inherited class 
class Rectangle extends Shape{
    //creating length and width of rectangle
   private double length=5.0;
   private double width=1.0;
   
   //overloading getarea method 
public double getarea(){
    return length*width;
}
}