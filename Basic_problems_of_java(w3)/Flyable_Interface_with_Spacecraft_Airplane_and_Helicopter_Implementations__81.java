//QUESTION-->
//Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.

//ANSWER-->
interface Flyable{
    public void fly_obj();
}

class Spacecraft implements Flyable{
 public void fly_obj(){
System.out.println("Spacecraft is flying");
}
}

class Airplane implements Flyable{
    public void fly_obj(){
    System.out.println("Airplane is flying");
    }
}

class Helicopter implements Flyable{
    public void fly_obj(){
    System.out.println("Helicopter is flying");
    }
}

public class Flyable_Interface_with_Spacecraft_Airplane_and_Helicopter_Implementations__81{
    public static void main(String[] args){
Flyable[] objects={new Spacecraft(), new Airplane(), new Helicopter()};

for(Flyable obj : objects){
    obj.fly_obj();
}
    }
}