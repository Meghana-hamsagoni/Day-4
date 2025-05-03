public class Reservation {
public String getReservationDetails ( String hotelName, String guestName, int nights) {
return " Hotel Name:" +hotelName  + "\n Guest Name :" + guestName + "\n Nights :" + nights ;
}
public static void main (String [] args) {
Reservation objref = new Reservation ();
  String result =objref.getReservationDetails("Grand Palace", "David", 3);
  System.out.println (result);
  String result2=objref.getReservationDetails("Grand Palace", "Maria ",4);
  System.out.println (result2);
}
}



 
