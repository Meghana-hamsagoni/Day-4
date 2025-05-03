public class Order {
public String getOrderDetails ( String restaurantName, String foodItem, int quantity) {
return "Restaurant Name :" + restaurantName + "\n Food Item :" + foodItem + "\n Quantity :" + quantity ;
}
public static void main (String [] args) {
Order objref = new Order ();
  String result =objref.getOrderDetails("Spice Garden", "Paneer Butter Masala",2 );
  System.out.println (result);
  String result2=objref.getOrderDetails("Spice Garden", "Chicken Biryani",3);
  System.out.println (result2);
}
}



 
