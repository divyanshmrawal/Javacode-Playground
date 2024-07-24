//QUESTION-->
//Write a Java program to take the last three characters from a given string. It will add the three characters at both the front and back of the string. String length must be greater than three and more.

//ANSWER-->
public class Arrangment_of_substring_in_java__55 {

    public static void main(String[] args){
        //Creating 1st string
        String str1="Python";
        //printing 1st string 
        System.out.print("Original string = "+str1);

        System.out.print("\n");

        //Creating 2nd string
        String substr1=str1.substring(str1.length()-3);
        //printing 2nd string 
      System.out.println("Result = "+substr1+str1+substr1);
    }
}