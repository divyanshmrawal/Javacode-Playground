 //QUESTION-->
 //Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
 
 //ANSWER-->
 interface Shaped {
     double getArea();
}

 class Rectangle implements Shaped {
double length;
double width;

public Rectangle(double lenght , double width){
    this.length=length;
    this.width=width;
}
    public double getArea(){
     return length*width;
    }

}

class Circle implements Shaped {
double radius;

public Circle(double radius){
    this.radius=radius;
}

public double getArea() {
    return Math.PI*radius*radius;
}
}

class Triangle implements Shaped {
double height;
double breath;

public Triangle(double height , double breath){
   this.height=height;
   this.breath=breath;
}

public double getArea(){
    return 0.5*breath*height;
}
}
 public class Interface_Shape_with_Rectangle_Circle_and_Triangle_Implementations__80 {
 
    public static void main(String[] args) {
        Shaped rectangle=new Rectangle(10,12);
        System.out.println("Area of rectangle = "+rectangle.getArea());

        Shaped circle=new Circle(3);
        System.out.println("Area of Circle = "+circle.getArea());

        Shaped triangle=new Triangle(4,6);
        System.out.println("Area of Triangle = "+triangle.getArea());

    }
 }