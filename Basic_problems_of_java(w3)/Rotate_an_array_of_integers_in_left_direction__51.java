//QUESTION-->
//Write a Java program to rotate an array (length 3) of integers in the left direction.

//ANSWER-->
import java.util.Arrays;
public class Rotate_an_array_of_integers_in_left_direction__51{
    public static void main(String[] args){
        //Creating array
        int[] arr={1,5,2};

        //Printing original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        //Arranging elements of array
        int[] arr_result={arr[1],arr[2],arr[0]};

        //Printing Rotated array
        System.out.print("Rotated Array" + Arrays.toString(arr_result));
    }
}