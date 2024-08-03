//QUESTION-->
// Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.

//ANSWER-->
public class  Person_Class_with_Encapsulation__85{
    //variable declaration
    private String name="Rahul";
    private int age=23;
    private String country="India";

    //Creating methods
    String Name(){
        return name;
    }

    int Age(){
        return age;
    }

    String Country(){
        return country;
    }

    public static void main(String[] args){
        //Creating object
        Person_Class_with_Encapsulation__85 data=new Person_Class_with_Encapsulation__85();
     // Printing details
     System.out.print("Name = "+data.Name()+"\n");
     System.out.print("Age = "+data.Age()+"\n");
     System.out.print("Country = "+data.Country()+"\n");
    }
}

