//QUESTION-->
// Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.

//ANSWER-->
import java.util.*;

public class  Creating_Array_of_String__63{
    public static void main(String[] args) {
        // Define the number of elements in the array
        int n = 5;
        
        // Create an array of strings with n elements
        String[] arr_string = new String[n];

        // creating array with string representations of numbers
        for (int i = 0; i < n; i++) {
            arr_string[i] = String.valueOf(i);
        }

        // Printing new array
        System.out.println("New Array: " + Arrays.toString(arr_string));
    }
}
