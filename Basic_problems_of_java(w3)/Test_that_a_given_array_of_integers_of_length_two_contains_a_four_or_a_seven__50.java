//QUESTION-->
//Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.

//ANSWER-->
public class Test_that_a_given_array_of_integers_of_length_two_contains_a_four_or_a_seven__50 {

    public static void main(String[] args){
    //Creating array
    int[] arr={4,5};

    //If condition is right than
    if(arr[0]==4 || arr[0]==7 || arr[1]==4 || arr[1]==7){
        //print true
    System.out.print("True");
    }

    //If condition is incorrect than
    else{
          //print false
        System.out.print("False");
    }
    }
}