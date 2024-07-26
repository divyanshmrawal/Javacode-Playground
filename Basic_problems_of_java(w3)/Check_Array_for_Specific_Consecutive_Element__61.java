//QUESTION-->
//Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.

//ANSWER-->
public class Check_Array_for_Specific_Consecutive_Element__61{
    public static void main(String[] args){
        //Creating array 
        int[] arr={20,20,5,4,10,10};

        //loop to check consecutive number in array
        for(int i=0;i<arr.length;i++){
            int j=i+1;

            //Checking consecutive numbers and print result
            if ((arr[i]==10 && arr[j]==10) || (arr[i]==20 && arr[j]==20)) {
                System.out.println("True");
                break;
            }

            else{
                System.out.println("Enter a valid number.");
                break;
            }
        }
    }
}