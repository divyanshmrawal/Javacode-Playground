//QUESTION-->
// Write a Java program to create an array from a given array of integers. The newly created array will contain the elements from the given array before the last element value of 10.

//ANSWER-->
import java.util.*;
public class Extract_Elements_After_Last_10__67{
    public static void main(String[] args){

    int [] arr={10, 5, 6, 10, 7, 3, 99};
    int last_number=0;
    
    for(int i=arr.length-1;i>=0;i--){
        if (arr[i]==10) {
            last_number=i;
            break;
        }
    }

    if (last_number!=0) {
        ArrayList<Integer> data=new ArrayList<>();

        for(int i=last_number+1;i<arr.length;i++){
         data.add(arr[i]);
        }

        System.out.println("Elements after the last occurrence of 10:");
        System.out.print("[");
        for(int num : data){
            System.out.print(num+",");
        }
        System.out.print("]");
    }
        else{
            System.out.println("The value 10 was not found in the array.");
        }
    
    }
}