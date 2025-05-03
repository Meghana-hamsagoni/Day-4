public class Enrollment {
public String getEnrollmentInfo ( String platform, String course, String student) {
return " Platform:" +platform  + "\n Course :" + course + "\n Student :" + student ;
}
public static void main (String [] args) {
Enrollment objref = new Enrollment ();
  String result =objref.getEnrollmentInfo("Udemy", "Java Programming","Alice" );
  System.out.println (result);
  String result2=objref.getEnrollmentInfo("Udemy", "Web Development ","Bob");
  System.out.println (result2);
}
}



 
