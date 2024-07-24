//QUESTION-->
//Write a Java program to multiply the corresponding elements of two integer arrays.

//ANSWER-->
public class Multiply_corresponding_elements_of_two_arrays_of_integers__54{
    public static void main(String[] args){
        //printing multiple array
        int[] arr1={6,3,72,9};
        int[] arr2={4,22,88,6};
        int[] result={arr1[0]*arr2[0],arr1[1]*arr2[1],arr1[2]*arr2[2]};

        //Finding largest number in resulting array
       for(int i=0;i<result.length;i++){
        System.out.print(result[i]+",");
       }

    }
}