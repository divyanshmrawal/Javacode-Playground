//QUESTION-->
// Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.

//ANSWER-->
class Rectangle{
    //Variable declaration
    private double length;
    private double width;

    //set and get length's value
    public double getLength(){
        return length;
    }

    public void setlength(double new_length){
        this.length=new_length;
    }

     //set and get width's value
    public double getWidth(){
        return width;
    }

    public void setWidth(double new_width){
        this.width=new_width;
    }
}


public class Java_Rectangle_Class_with_Getters_and_Setters__86 {
public static void main(String[] args){
    //Creating object
    Rectangle data=new Rectangle();

    //Printing length and width of Rectangle
    data.setlength(66);
    System.out.println("Length of Rectangle = "+data.getLength());

    data.setWidth(99);
   System.out.println("Length of Rectangle = "+ data.getWidth());
}
    
}
