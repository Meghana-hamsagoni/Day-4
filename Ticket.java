public class Ticket {
public String getTicketDetails ( String theatreName, String movieItem, String seatNo) {
return "Theatre Name :" +theatreName  + "\n Movie Item :" + movieItem + "\n Seat Number :" + seatNo ;
}
public static void main (String [] args) {
Ticket objref = new Ticket ();
  String result =objref.getTicketDetails("Galaxy", "Interseller","A10" );
  System.out.println (result);
  String result2=objref.getTicketDetails("Galaxy", "Inception ","B12");
  System.out.println (result2);
}
}



 
