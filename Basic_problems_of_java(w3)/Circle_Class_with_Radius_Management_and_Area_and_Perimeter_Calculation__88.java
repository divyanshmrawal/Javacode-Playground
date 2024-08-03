//QUESTION-->
//Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.

//ANSWER-->
class Circle{
    //Variable declaration
    private double radius;

    //get radius of circle
    public double getRadius(){
        return radius;
    }

    //set radius of cirlce
    public void setRadius(double new_radius){
        this.radius=new_radius;
    }

    //Calculating area of circle
    public double CalculateArea(){
        return (Math.PI*Math.pow(radius,2));
    }

    //Calculating perimeter of circle
    public double CalculatePerimeter(){
        return (2*Math.PI*radius);
    }
}

public class Circle_Class_with_Radius_Management_and_Area_and_Perimeter_Calculation__88{
    public static void main(String[] args){
        //Creating object
        Circle data=new Circle();

        //setting radius of circle
        data.setRadius(7);
        
        //printing values of circle
        System.out.println("Radius = "+data.getRadius());
        System.out.println("Area of circle = "+data.CalculateArea());
        System.out.println("Perimeter of circle = "+data.CalculatePerimeter());
    }
}