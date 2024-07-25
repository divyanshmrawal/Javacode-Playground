//QUESTION-->
//Write a Java program to count the number of even and odd elements in a given array of integers.

//ANSWER-->
public class Counting_Even_and_Odd_number_in_array__60 {
    public static void main(String[] args){
        //creating a variable for sorting number of even and odd numbers
        int evennum=0;
        int oddnum=0;

        //creating a sample array
        int[] arr={4,66,1,9,40,7,};

        for(int i=0;i<arr.length;i++){  //loop start to read every number in array
            //counting even number in array
          if(arr[i]%2==0){
            evennum+=1;
          }

          //counting odd number in array
          else if(arr[i]!=0){
            oddnum+=1;
          }
        }
        //printing even and odd numbers in array
        System.out.println("Even number = "+evennum);
        System.out.println("Odd number = "+oddnum);
    }
}