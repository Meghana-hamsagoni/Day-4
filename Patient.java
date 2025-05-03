public class Patient {
public void printDetails ( String hospitalName, String patientName, int age) {
System.out.println("  Hospital Name :" + hospitalName);
System.out.println(" Patient Name  :" + patientName );
System.out.println(" Patient Age :" + age);
}
public static void main (String [] args) {
Patient objref = new Patient();
objref.printDetails("Care Hospitals", "Saisree ",30 );
objref.printDetails("Apollo", "Manisha",20 );
}
}



 
