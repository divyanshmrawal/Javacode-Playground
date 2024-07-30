//QUESTION-->
//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

//ANSWER-->
public class Animal_Class_with_Cat_Subclass__72 {

//creating main method of main class
public static void main(String[] args){

    //creating objects
Animal animal = new Animal();
Cat cat = new Cat();

//calling methods
animal.makesound();
cat.makesound();
}
    
}

//creating animal class
 class Animal{
    //method to print text
 public void makesound(){
    System.out.println("meauuu");
 }   
}

//creating inherited class
 class Cat extends Animal{
    //overloading 
    public void makesound(){
        //printing text
        System.out.println("bark");
    }
}