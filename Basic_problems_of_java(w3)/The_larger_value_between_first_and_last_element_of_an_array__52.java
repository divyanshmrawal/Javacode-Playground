//QUESTION-->
//Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers.

//ANSWER-->
import java.util.*;
public class The_larger_value_between_first_and_last_element_of_an_array__52{
    public static void main(String[] args){
        //Array
    int[] arr={2,6,1};
    //Calculating Largest number
    for(int i=0;i<arr.length-1;i++){
    if(arr[0]<arr[i]){
    arr[0]=arr[i];
    }
}
System.out.println("Largest number = "+arr[0]);
    }
}