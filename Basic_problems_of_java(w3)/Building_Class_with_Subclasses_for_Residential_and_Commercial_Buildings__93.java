//QUESTION-->
//Write a Java program to create a class called "Building" with attributes for address, number of floors, and total area. Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like number of apartments for residential and office space for commercial buildings. Implement a method to calculate the total rent for each subclass.

//ANSWER-->
class Building{
    String Address;
    double NoOfFloors;
    double Area;

    public Building(String Address , double Area , double NoOfFloors){
        this.Address=Address;
        this.NoOfFloors=NoOfFloors;
        this.Area=Area;
    }

    public void Printdetails(){
        System.out.println("Address = "+Address+"\nNoOfFloors = "+NoOfFloors+" Area = "+Area);
    }
}

class ResidentialBuilding extends Building{
double NoOfApartments;
double pricePerApartments;

public ResidentialBuilding(String Address , double Area , double NoOfFloors , double NoOfApartments , double pricePerApartments){
    super(Address, NoOfFloors, Area); 
this.NoOfApartments=NoOfApartments;
this.pricePerApartments=pricePerApartments;
}

public double TotalPrice(){
    return NoOfApartments*pricePerApartments;
}

public void Printdetails2(){
    super.Printdetails();
    System.out.println("Total number of Apartments = "+NoOfApartments);
    System.out.println("Price per Apartment"+pricePerApartments);
    System.out.println("Total Price = "+TotalPrice());
}

}

class CommercialBuilding extends Building{
double OfficeSpace;
double Pricepersquaremeters;

public CommercialBuilding(String Address , double Area , double NoOfFloors , double OfficeSpace , double Pricepersquaremeters){
    super( Address ,  Area ,  NoOfFloors);
        this.OfficeSpace= OfficeSpace;
        this.Pricepersquaremeters= Pricepersquaremeters;
    
}

public double TotalPrice2(){
    return OfficeSpace*Pricepersquaremeters;
}

public void Printdetails3(){
    super.Printdetails();
    System.out.println("Office Space = "+OfficeSpace);
    System.out.println("Price per officeSpace = "+Pricepersquaremeters);
    System.out.println("Total price = "+TotalPrice2());
}
}


public class Building_Class_with_Subclasses_for_Residential_and_Commercial_Buildings__93 {

    public static void main(String[] args){
        ResidentialBuilding residentialBuilding =new ResidentialBuilding("36 Naroda Jodhpur" , 10 , 2500 , 20 , 1000);
        System.out.println("Details of ResidentialBuilding");
        residentialBuilding.Printdetails2();
        
        CommercialBuilding commercialBuilding=new CommercialBuilding("Jotwada", 15, 4500, 3000, 20);
        System.out.println("\n Details of CommercialBuilding");
        commercialBuilding.Printdetails3();
    }
}