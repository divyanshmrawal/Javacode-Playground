//QUESTION-->
//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.

//ANSWER-->

//Creating abstract class named as Shape
abstract class Shape{
 //Creating methods to calculate area and perimeter
     abstract double calculatearea();
     abstract double calculateperimeter();
}

class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

 double calculatearea(){
double area=3.14*radius*radius;
System.out.println("Area of Circle = "+area);
return area;
}

 double calculateperimeter(){
    double perimeter=3.14*radius*2;
    System.out.println("Area of Circle = "+ perimeter);
    return perimeter;
}

}

class Triangle extends Shape{

    private double base;
    private double height;
    private double len1;
    private double len2;
    private double len3;

    public Triangle(double base , double height , double len1 , double len2 , double len3){
        this.base=base;
        this.height = height;
        this.len1 = len1;
        this.len2 = len2;
        this.len3 = len3;
    }

     double calculatearea(){
        double areatriangle=(0.5*base*height);
        System.out.println("Area of Triangle = "+areatriangle);
        return areatriangle;
        }
        
         double calculateperimeter(){
            double perimetertriangle=len1+len2+len3;
            System.out.println("Area of Triangle = "+ perimetertriangle);
            return perimetertriangle;
        }
}

public class Abstract_Shape_Class_with_Circle_and_Triangle_Subclasses__76{
    public static void main(String[] args){
        Shape circle = new Circle(5);
        circle.calculatearea();
        circle.calculateperimeter();

        Shape triangle = new Triangle(3,4,3,4,5);
        triangle.calculatearea();
        triangle.calculateperimeter();
    }
}