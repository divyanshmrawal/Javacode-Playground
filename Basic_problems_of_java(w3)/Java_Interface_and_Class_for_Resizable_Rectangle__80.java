//QUESTION-->
//Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.

//ANSWER-->
interface Resizable{
    public void resizeWidth(int width);
    public void resizeheight(int height);
}

class Rectangle implements Resizable{
int width;
int height;

public Rectangle(int width , int height){
    this.width=width;
    this.height=height;
}

public void resizeWidth(int width){
    this.width=width;
}

public void resizeheight(int height){
    this.height=height;
}

public void value(){
System.out.println("Width = "+width + "Height = "+height);
}
}

public class Java_Interface_and_Class_for_Resizable_Rectangle__80 {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(540, 700);

    rectangle.value();

    rectangle.resizeWidth(150);
    rectangle.resizeheight(555);

    rectangle.value();
    }
}