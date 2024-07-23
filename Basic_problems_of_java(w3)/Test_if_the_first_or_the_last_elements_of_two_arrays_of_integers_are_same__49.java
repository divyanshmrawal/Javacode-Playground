//QUESTION-->
//Write a Java program to test if the first and last element of two integer arrays are the same. The array length must be greater than or equal to 2.

//ANSWER-->
public class Test_if_the_first_or_the_last_elements_of_two_arrays_of_integers_are_same__49{
    public static void main(String[] args){
        //Accepting number from userinput
        int arr1[]={1,3,2,6,4,55,67,99,1};
        int arr2[]={12,4,78,3,34,36,56};

        //Checking condition and printing result
        if(arr1.length>=2 && arr2.length>=2){
            boolean result=arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1];
            System.out.println(result);
        }
        else{
            System.out.println("Array lengths less than 2.");
        }
    }
}