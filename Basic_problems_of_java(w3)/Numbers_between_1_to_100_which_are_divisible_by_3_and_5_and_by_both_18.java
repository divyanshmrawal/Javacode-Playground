//QUESTION-->
//Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both

//ANSWER-->
public class Numbers_between_1_to_100_which_are_divisible_by_3_and_5_and_by_both_18{
    public static void main(String[] args){
        //DATA of numbers which are divisible by 3
        System.out.println("Numers which are divisible by 3 : ");
    for(int i=1;i<=100;i++){
        if(i%3==0){
            System.out.println(i);
        }
    }
    //DATA of numbers which are divisible by 5
    System.out.println("Numers which are divisible by 5 : ");
    for(int i=1;i<=100;i++){
         if(i%5==0){
            System.out.println(i);
        }
    }
    //DATA of numbers which are divisible by 3 and 5
    System.out.println("Numers which are divisible by 3 and 5 : ");
    for(int i=1;i<=100;i++){
         if(i%5==0 && i%3==0){
            System.out.println(i);
        }
    }
    
    }
}