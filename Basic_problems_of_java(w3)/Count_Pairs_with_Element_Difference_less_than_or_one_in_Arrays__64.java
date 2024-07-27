//QUESTION-->
//Write a Java program to count the elements that differ by 1 or less between two given arrays of integers with the same length.

//ANSWER-->
import java.util.*;

public class  Count_Pairs_with_Element_Difference_less_than_or_one_in_Arrays__64{
    public static void main(String[] args) {
        int[] arr1= {10, 11, 10, 20, 43, 20, 50};
        int[] arr2 = {10, 13, 11, 20, 44, 30, 50};
        System.out.println("Array1: "+Arrays.toString(arr1)); 
        System.out.println("Array2: "+Arrays.toString(arr2 )); 
        
        int count = 0; 


        for (int i = 0; i < arr1.length; i++) {
 
            if (Math.abs(arr1[i] - arr2 [i]) <= 1 && arr1[i] != arr2 [i]) {
                count++; 
            }
        }
        
        System.out.printf("Number of elements: "+count); 
        System.out.printf("\n");	 
    }
}
