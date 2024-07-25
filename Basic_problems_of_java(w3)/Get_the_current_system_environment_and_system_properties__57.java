//QUESTION-->
// Write a Java program to get the current system environment and system properties

//ANSWER-->
public class Get_the_current_system_environment_and_system_properties__57{
    public static void main(String[] args){
        //printing current system environment
        System.out.print("Your Current system environment = ");
        System.out.print(System.getenv());

        //printing system properties
        System.out.print("Your Current system properties = ");
        System.out.print(System.getProperties());
    }
}