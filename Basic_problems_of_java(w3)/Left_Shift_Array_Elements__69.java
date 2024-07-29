//QUESTION-->
//Write a Java program to create an array left shifted from a given array of integers.

//ANSWER-->
import java.util.*;
public class Left_Shift_Array_Elements__69{
    public static void main(String[] args) {
        //Creating array
        int[] arr={1,4,2,6,3,7};
        
        //Printing original array
        System.out.print("original_array = "+Arrays.toString(arr));

        //Shifting array elements to left
        arr[arr.length-1]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }

        //Printing shifted array
        System.out.print("\nShifted_array = "+Arrays.toString(arr));
    }
}