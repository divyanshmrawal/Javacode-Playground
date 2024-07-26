//QUESTION-->
//Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.

//ANSWER-->
public class Separate_Odd_and_Even_Numbers_in_Array__62{
    public static void main(String[] args){
        //Creating array
        int[] arr={2,4,1,7,8};
       
        System.out.print("[");
        //separate even numbers
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            System.out.print(arr[i]+",");    
        }
       } 

       //separate odd numbers
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            System.out.print(arr[i]+",");   
        }
       } 

       System.out.print("]");
    }
}