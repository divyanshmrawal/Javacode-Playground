//QUESTION-->
//Write a java program to check if 10 appears as either the first or last element.

//ANSWER->
public class Test_if_10_appears_as_either_the_first_or_last_element__47{
    public static void main(String[] args){
        int arr[]={10,3,4,5,6,7,4,10};

        
boolean result=(arr[0]==10 || arr[arr.length-1]==10);
System.out.print(result);
    }
}