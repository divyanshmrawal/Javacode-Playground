//QUESTION-->
//Write a Java program to print odd numbers from 1 to 99. Prints one number per line.

//ANSWER-->
public class Print_the_odd_numbers_from_1_to_99__16{

    public static void main(String[] args) {
        System.out.println("List of odd numbers from 1 to 99 :");
        //FOR loop -1 
        for(int i=1;i<100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}