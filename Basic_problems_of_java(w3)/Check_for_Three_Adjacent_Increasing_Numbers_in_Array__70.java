//QUESTION-->
//Write a Java program to check if an array of integers contains three increasing adjacent numbers.

//ANSWER-->
public class Check_for_Three_Adjacent_Increasing_Numbers_in_Array__70{

    public static void main(String[] args){

        //Creating arrays
        int[] arr={1,4,3,6,9,7};

        int last_num=arr.length-3;

        //Checking condition
        for(int i=0;i<=last_num;i++){
        int j=i+1;
        int k=i+2;
        if(arr[k]==arr[i]+2 && arr[j]==arr[i]+1){
            boolean result=true;
            System.out.println(result);
            break;
        }
        else{
            boolean result=false;
            System.out.println(result);
            break;
        }
}
}}