//QUESTION->
//Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.

//ANSWER-->
abstract class Animal{
 abstract void Eat();
 abstract void Sleep();
}

class Lion extends Animal{
    public void Eat(){
        System.out.println("Lion eats meat.");
    };
    public void Sleep(){
        System.out.println("Lion sleep in his cave.");
    };
}

class Tiger extends Animal{
    public void Eat(){
        System.out.println("Tiger also eats meat.");
    };
    public void Sleep(){
        System.out.println("Tiger sleep under tree.");
    };
}

class Deer extends Animal{
    public void Eat(){
        System.out.println("Deer eats grass.");
    };
    public void Sleep(){
        System.out.println("Deer sleep in his house.");
    };
}

public class Abstract_Animal_Class_with_Lion_Tiger_and_Deer_Subclasses__78{

    public static void main(String[] args){
        Animal lion=new Lion();
        lion.Eat();
        lion.Sleep();

        Animal tiger=new Tiger();
        tiger.Eat();
        tiger.Sleep();

        Animal deer=new Deer();
        deer.Eat();
        deer.Sleep();
    }
}
