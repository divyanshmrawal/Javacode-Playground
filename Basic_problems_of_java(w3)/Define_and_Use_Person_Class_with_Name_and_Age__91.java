//QUESTION-->
//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

//ANSWER-->
class Person{
    String name;
    double age;

    Person(String name , double age){
        this.name=name;
        this.age=age;

        System.out.println("Name = "+name +"\nAge = "+age);
    }   
}

public class Define_and_Use_Person_Class_with_Name_and_Age__91{
    public static void main(String[] args){
        Person data=new Person("Dev" , 55);
    }
}