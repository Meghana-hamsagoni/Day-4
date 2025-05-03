public class Travel {
public String getBookingDetails ( String agency, String destination, int travellers) {
return " Agency:" +agency  + "\n Destination :" + destination + "\n Travellers :" + travellers ;
}
public static void main (String [] args) {
Travel objref = new Travel ();
  String result =objref.getBookingDetails("Wanderlust Travels", "Paris", 3);
  System.out.println (result);
  String result2=objref.getBookingDetails("Wanderlust", "Tokyo ",4);
  System.out.println (result2);
}
}



 
