//QUESTION-->
//Write a Java program to create a class called Account with private instance variables accountNumber, accountHolder, and balance. Provide public getter and setter methods to access and modify these variables. Add a method called deposit() that takes an amount and increases the balance by that amount, and a method called withdraw() that takes an amount and decreases the balance by that amount.

//ANSWER-->
class Accounts{
    //Variable declaration
    private double accountNumber;
    private String accountHolder;
    private double Balance;

    //get and set method on accountnumber
    public double getaccountNumber(){
        return accountNumber;
    }
    public void setaccountNumber(double new_accountNumber){
        this.accountNumber=new_accountNumber;
    }

    //get and set method on accountHolder
    public String getaccountHolder(){
        return accountHolder;
    }
    public void setaccountHolder(String AccountHolder){
        this.accountHolder=AccountHolder;
    }

    //get and set method on accountBalance
    public double getBalance(){
        return Balance;
    }

   public void setbalance(double new_balance){
    this.Balance=new_balance;
   }

   //deposite section
   public void deposite(double depositenum){
    if(depositenum>0){
        this.Balance+=depositenum;
    }
   }

   //withdrawing section
   public void withdraw(double withdrawnum){
    if(withdrawnum>0 && withdrawnum<=Balance){
      Balance-=withdrawnum;
    }
   }
}

public class Java_Class_for_Account_with_Deposit_and_Withdrawal_Methods__90{
    public static void main(String[] args){
       //Creating object
        Accounts data=new Accounts();

        //Set and printing value of AccountHolder
        data.setaccountHolder("Dev");
        System.out.println("Account Holder = "+data.getaccountHolder());

        //Set and printing value of AccountNumber
        data.setaccountNumber(12345);
        System.out.println("Account Number = "+ data.getaccountNumber());

        //set Account balance
        data.setbalance(5000);
        //depositing amount in Account
        data.deposite(1000);
         //withdrawing amount in Account
        data.withdraw(2000);

        //Printing Account balance
        System.out.println("Account Balance = "+data.getBalance());
    }
}