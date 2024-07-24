//QUESTION-->
//Write a Java program to find the largest element between the first, last, and middle values in an array of integers (odd length).

//ANSWER-->
public class The_largest_element_in_array_which_has_odd_length__53 {
    public static void main(String[] args) {
        //Creating array
        int[] arr = { 4, 200, 88, 33, 90 };

        if(arr.length%2!=0){
            //loop for reading all elements in array
            for(int i=0;i<arr.length;i++){

                //finding largest number in array
                if(arr[0]<arr[i]){
                    arr[0]=arr[i];
                }
            }
            //Printing largest number of array
            System.out.print("Largest number = "+arr[0]);
        }

        //if length of array is not a odd number than
        else{
            //print this 
            System.out.println("Please enter a velid array.");
        }
    }
}