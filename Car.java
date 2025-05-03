public class Car {
public void displayDetails ( String showroomName, String modelName, int price) {
System.out.println(" Showroom Name :" + showroomName);
System.out.println(" Car Model :" + modelName);
System.out.println(" Car Price :" + price);
}
public static void main (String [] args) {
Car objref = new Car();
objref.displayDetails("Elite Motors", "Telsa Model 5", 800000);
objref.displayDetails("Elite Motors", "BMW X5", 75000);
}
}



 
