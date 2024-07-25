//QUESTION-->
//Write a Java program to check whether a security manager has already been established for the current application or not.

//ANSWER-->
public class Check_a_security_manager__58 {

    public static void main(String[] args){
        //printing system manager status
        System.out.println("security manager = ");
        System.out.print(System.getSecurityManager());
    }
}