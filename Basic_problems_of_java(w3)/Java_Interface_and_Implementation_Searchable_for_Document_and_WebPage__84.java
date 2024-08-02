//QUESTION-->
//Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document. Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method.

//ANSWER-->
interface Searchable {
   public void search(String text1);
}

class Document implements Searchable{
public void search(String text1){
    if(text1.contains("Hello")){
        System.out.println("true");
    }
    else{
        System.out.println("False");
    }
}
}

 class WebPage implements Searchable{
public void search(String text2){
    if(text2.contains("URL")){
    System.out.println("True");
    }
    else{
        System.out.println("False");
    }
}
 }

public class Java_Interface_and_Implementation_Searchable_for_Document_and_WebPage__84{
    public static void main(String[] args){
        String text1="Hello world my name is dev";
        Searchable data=new Document();
        data.search(text1);

        String text2="URL youtube ";
        Searchable data2=new WebPage();
        data2.search(text2);
    }
}