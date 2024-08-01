//QUESTION-->
// Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.


//ANSWER-->
import java.util.*;
abstract class Shaped3D{
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}

class Sphere extends Shaped3D{
    double radius;

    public Sphere (double radius){
        this.radius=radius;

    }

    @Override
    public double calculateVolume() {
        return (4/3)*Math.PI*Math.pow(radius,3);
    }

    public double calculateSurfaceArea(){
        return 4*Math.PI*Math.pow(radius,2); 
    }
}

class Cube extends Shaped3D{
    double side_length;

    public Cube (double side_length){
        this.side_length=side_length;
    }

    public double calculateVolume(){
        return Math.pow(side_length,3);
    }

    public double calculateSurfaceArea(){
        return 6*Math.pow(side_length,2);
    }
}

public class Abstract_Class_Shape3D_with_Sphere_and_Cube_Subclasses__79 {

    public static void main(String[] args){
    Shaped3D sphere=new Sphere(7);
    Shaped3D cube=new Cube(6);
    System.out.println("Sphere volume = "+sphere.calculateVolume());
    System.out.println("Sphere surface = "+sphere.calculateSurfaceArea());
    System.out.println("Cube volume = "+cube.calculateVolume());
    System.out.println("Cube Surface area"+cube.calculateSurfaceArea());
    }
}

