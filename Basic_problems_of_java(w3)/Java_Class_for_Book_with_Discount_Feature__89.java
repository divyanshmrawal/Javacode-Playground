//QUESTION-->
//Write a Java program to create a class called “Book” with private instance variables title, author, and price. Provide public getter and setter methods to access and modify these variables. Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.

//ANSWER-->
class Book{
    //Variable declaration
    private String Title;
    private String Author;
    private double Price;

    //get and set method on Title
public String getTitle(){
    return Title;
}

public void setTitle(String new_Title){
    this.Title=new_Title;
}

//get and set method on Author
public String getAuthor(){
    return Author;
}

public void setAuthor(String new_Author){
    this.Author=new_Author;
}

//get and set method on Author
public double getPrice(){
    return Price;
}

public void setPrice(double new_Price){
this.Price=new_Price;
}

//Apply Discount 
public void Discount(double percent){
    if(percent > 0 && percent <= 100){
        this.Price -= this.Price*(percent/100);
    }
}
}

public class Java_Class_for_Book_with_Discount_Feature__89{
    public static void main(String[] args){

        //Creating object
        Book data=new Book();

        //Printing name of Author
        data.setAuthor("First head java");
        System.out.println("Author name = "+data.getAuthor());

        //Printing Title of book
        data.setTitle("Rahul");
        System.out.println("Title name = "+data.getTitle());

        //Set Price 
        data.setPrice(500);
        data.Discount(10);

        //Printing of price of book
        System.out.println("Price of book = "+data.getPrice());
        
    }
}