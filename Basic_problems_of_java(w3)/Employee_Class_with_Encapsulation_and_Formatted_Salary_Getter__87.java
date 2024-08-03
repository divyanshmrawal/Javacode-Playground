//QUESTION-->
//Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.

//ANSWER-->
class Employee{
    private double employee_id;
    private String employee_name;
    private double employee_salary;

    //employee id
    public double getemployee_id(){
    return employee_id;
    }
    public void setemployee_id(double newID){
    this.employee_id=newID;
    }

    //employee name
    public String get_Employee_name(){
        return employee_name;
    }

    public void set_Employee_name(String newName){
    this.employee_name=newName;
    }

    //employee salary
    public double get_employee_salary(){
        return employee_salary;
    }

    public void set_employee_salary(double new_salary){
    this.employee_salary=new_salary;
    }

    public String getyour_salary(){
        return String.format("$", employee_salary);
    }

}
public class Employee_Class_with_Encapsulation_and_Formatted_Salary_Getter__87 {
    public static void main(String[] args){
        //Creating object
        Employee data=new Employee();

        //Set name salary and id of employee
        data.set_Employee_name("Rahul");
        data.set_employee_salary(50000000);
        data.setemployee_id(036);

        //printing name salary and id of employee
        System.out.println("Name = "+data.get_Employee_name());
        System.out.println("ID = "+data.getemployee_id());
        System.out.println("Salary = "+data.get_employee_salary());
    }
} 