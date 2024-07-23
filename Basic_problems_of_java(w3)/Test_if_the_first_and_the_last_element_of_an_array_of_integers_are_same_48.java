//QUESTION-->
// Write a Java program to test if the first and last elements of an array of integers are the same

//ANSWER-->
public class Test_if_the_first_and_the_last_element_of_an_array_of_integers_are_same_48{
    public static void main(String[] args){
        int[] arr={1,9,4,7,3,8,1};

        //checking condition
        boolean result=(arr[0]==arr[arr.length-1]);
        //printing result
     System.out.println(result);   
    }
}