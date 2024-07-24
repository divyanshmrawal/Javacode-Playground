//QUESTION-->
//Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array.

//ANSWER-->
public class Swap_the_first_and_last_elements_of_an_array__53{
    public static void main(String[] args){
        //Creating array
        int[] arr={2,5,1};

        //Printing array before swapping
        System.out.print("array without swapping = ");
       for(int i=0;i<arr.length;i++){
        System.out.print(+arr[i]);
       }

       //Swapping numbers
        int x=arr[0];
        arr[0]=arr[2];
        arr[2]=x;

        System.out.print("\n");
        
         //Printing array after swapping
        System.out.print("Swapped array = ");
        for(int j=0;j<arr.length;j++){
        System.out.print(arr[j]);
        }
    }
}