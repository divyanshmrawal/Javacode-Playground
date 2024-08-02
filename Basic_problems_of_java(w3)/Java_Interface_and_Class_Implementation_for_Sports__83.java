//QUESTION-->
//Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports.

//ANSWER-->
interface Playable{
    public void play();
}

class Football implements Playable{
public void play(){
    System.out.println("play football.");
}
}

class Volleyball implements Playable{
    public void play(){
    System.out.println("play Volleyball.");
    }
}

class Basketball implements Playable{
    public void play(){
    System.out.println("play Basketball.");
    }
}
public class Java_Interface_and_Class_Implementation_for_Sports__83{
public static void main(String[] args){
    Playable football=new Football();
    football.play();
    Playable volleyball=new Volleyball();
    volleyball.play();
    Playable basketball=new Basketball();
    basketball.play();
}
}