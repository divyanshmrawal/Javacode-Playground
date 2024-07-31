//QUESTION-->
//Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

//ANSWER-->

//Creating abstract class called Animal
abstract class Animal{
    //Creating abstract method called sound
 public abstract void sound();
}

//Creating inherited class of Animal called Lion
class Lion extends Animal{
    // using method
public void sound(){
    System.out.println("wo wo wo");
}
}

//Creating inherited class of Animal called Tiger
class  Tiger extends Animal{
     // using method
    public void sound(){
        System.out.println("bobobobo");
    }
}

public class Abstract_Animal_Class_with_Lion_and_Tiger_Subclasses__75 {

    public static void main(String[] args){

        //Creating object called lionobj
        Animal lionobj=new Lion();
        //calling sound method
        lionobj.sound();

         //Creating object called lionobj
        Animal tiger=new Tiger();
        //calling sound method
        tiger.sound();
        
    }
}
