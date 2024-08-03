 //QUESTION-->
 //Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.
 
 //ANSWER-->
 class BankAccount{
    private double accountnumber;
    private double balance;

    //getter Account number
    public double getAccountnumber(){
        return accountnumber;
    }

    //Setter  Account number
    public void setAccountnumber( double new_AccNum){
        this.accountnumber=new_AccNum;
    }

    //getter Balance number
    public double getAccountbalance(){
        return balance;
    }

    //setter Account number
    public void setAccBalance(double Acc_balance){
        this.balance=Acc_balance;
    }
}

public class  BankAccount_Class_Implementing_Getters_and_Setters__85{
public static void main (String[] args){
    BankAccount data=new BankAccount();

    data.setAccBalance(500.0);
    System.out.println("Balance = "+data.getAccountbalance());

    data.setAccountnumber(119922);
    System.out.println("Account number = "+data.getAccountnumber());
}
    
}