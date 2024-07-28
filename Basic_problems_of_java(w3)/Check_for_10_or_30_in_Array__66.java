//QUESTION-->
//Write a Java program to check if a specified array of integers contains 10 or 30.

//ANSWER-->
public class Check_for_10_or_30_in_Array__66{
    public static void main(String[] args){

        //Variable declaration
        int[] arr={4,55,10,10,16,6};
        boolean count=false;

        //Checking if any element 10 or 30
        for(int i=0;i<arr.length;i++){
            if(arr[i]==10 || arr[i]==30){
             count=true;
            }
        }

        //Printing result
        System.out.println("Result = "+ count);
    }
}