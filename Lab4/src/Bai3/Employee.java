package Bai3;

public class Employee extends Person {
private String employerName;
private String datehired;
public Employee() {
	
}
public Employee(String name, int age, String gender, String employerName, String datehired) {
	super(name, age, gender);
	this.employerName = employerName;
	this.datehired = datehired;
}
public String getEmployerName() {
	return employerName;
}
public void setEmployerName(String employerName) {
	this.employerName = employerName;
}
public String getDatehired() {
	return datehired;
}
public void setDatehired(String datehired) {
	this.datehired = datehired;
}
@Override
public String toString() {
	return super.toString()+ "\n EmployerName: " + employerName + "\n DateHired: " + datehired ;
}






}


