//QUESTION-->
//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

//ANSWER-->
class Dog{
    //Variable Declaration
    private String name;
    private String breed;

    //Creating constructor
    Dog(String name , String breed){
     this.name=name;
     this.breed=breed;
    }

    //Setting details of object
    public void setDetails(String new_name , String new_breed){
     this.name=new_name;
     this.breed=new_breed;
    }

    //Method of Printing name and breed of object
    public void printingDetails(){
        System.out.println("Name = "+name+" ,"+" Breed = "+breed +"\n");
    }
}

public class Creating_and_Modifying_Dog_Class_Instances__92 {
public static void main(String[] args){
    //Creating object and calling PrintingDetails method to print details
    Dog myobj=new Dog("Honey","Chihuahua");
    myobj.printingDetails();

    //Modifing name and breed then calling PrintingDetails method to print details
    myobj.setDetails("Frenkey","Pug");
    myobj.printingDetails();
}
}