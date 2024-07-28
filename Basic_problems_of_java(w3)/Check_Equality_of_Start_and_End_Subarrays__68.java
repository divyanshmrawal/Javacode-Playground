//QUESTION-->
//Write a Java program to check if a group of numbers (l) at the start and end of a given array are the same

//ANSWER-->
public class Check_Equality_of_Start_and_End_Subarrays__68 {

    public static void main(String[] args){

        //set boolean to false as default
        boolean result=false;

        //Creating array
        int arr[]={2,4,5,6,3,28,4};
        //Checking condition
        if (arr[0]==arr[arr.length-2] && arr[1]==arr[arr.length-1]) {
            result=true;
        }

        //Printing result
        System.out.println(result);
    }
}