//QUESTION-->
//Compute the sum of the prime numbers till 100 using java

//ANSWER-->
public class Compute_the_sum_of_the_prime_numbers_till_100__30 {

    public static void main(String[] args){
        int sum=0;
    for(int i=2;i<=100;i++){
        boolean isprime=true;
        for(int j=2;j<=Math.sqrt(i);j++){
            if (i%j==0) {
             isprime=false;
                break;
            }
        }
        if (isprime) {
            sum=sum+i;
        }
    }
    System.out.println(sum);
    }
}