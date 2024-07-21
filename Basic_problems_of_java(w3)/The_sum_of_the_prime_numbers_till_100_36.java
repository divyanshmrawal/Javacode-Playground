//QUESTION-->
//Write a Java program to compute the sum of the first 100 prime numbers.

//ANSWER-->
public class The_sum_of_the_prime_numbers_till_100_36 {
    public static void main(String[] args){
        int sum=0;
        for (int i=2;i<=100;i++){
            boolean result=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0) {
                result=false;
                break;
                }
            }
            if (result==true) {
                sum=sum+i;
            }
        }
        System.out.println("Sum of all prime numbers is = "+sum);
    
    }
}