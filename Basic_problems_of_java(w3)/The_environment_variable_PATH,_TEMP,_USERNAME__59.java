//QUESTION-->
// Write a Java program to get the value of environment variables PATH, TEMP, USERNAME.

//ANSWER-->
public class The_environment_variable_PATH,_TEMP,_USERNAME__59{
    public static void main(String[] args){
        //Printing Environment PATH
        System.out.print("Environment PATH = ");
        System.out.print(System.getenv("PATH"));
         
        //Printing Environment TEMP
        System.out.print("Environment TEMP = ");
        System.out.print(System.getenv("TEMP"));

        //Printing Environment USERNAME
        System.out.print("Environment USERNAME = ");
        System.out.print(System.getenv("USERNAME"));
    }
}