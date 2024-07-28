//QUESTION-->
// Write a Java program to determine whether the number 10 in a given array of integers exceeds 20

//ANSWER-->
public class Compare_Count_of_10s_vs_20s_in_Array__64{

    //Variable declaration
    public static void main(String[] args){
        int[] arr={10,44,3,10,10,20,26,20};
        int count_10=0;
        int count_20=0;

        //Counting number of value 10 and 20 in array
        for(int i=0;i<arr.length;i++){

            if(arr[i]==10){
                count_10+=1;
            }

            else if (arr[i]==20) {
                count_20+=1;
            }
        }

        //Printing result
        if (count_10>count_20) {
            System.out.println("True");
        }

        else if (count_10<count_20) {
            System.out.println("False");
        }
    }
}