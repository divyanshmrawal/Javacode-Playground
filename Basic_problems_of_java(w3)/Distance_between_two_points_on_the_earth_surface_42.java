//QUESTION-->
//Write a java program to find distance between two points on earth's surface

//ANSWER-->
public class Distance_between_two_points_on_the_earth_surface_42{
 
   public static void main(String[] args) {
    System.out.print("distance = "+ data(6371.01, 25 , 35.5 , 35 , 25.5));
   }

    public static double data(double radius , double x1 , double x2 , double y1 , double y2){
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
    double area=radius*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
    return area;
    }

}