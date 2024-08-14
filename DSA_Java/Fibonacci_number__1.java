//QUESTION-->
//Find first 20 Fibonacci numbers 

//ANSWER-->
public class Fibonacci_number__1 {

    public static void main(String[] args){
        //Variable declaration
        int prevousnum1=0;
        int prevousnum2=1;

        //Printing first 2 numbers
        System.out.println(prevousnum1);
        System.out.println(prevousnum2);

        //Finding fibonacci number with using loop
        for(int i=0;i<18;i++){
            int result=prevousnum1+prevousnum2;
            System.out.println(result);

            prevousnum1=prevousnum2;
            prevousnum2=result;
        }
    }
}