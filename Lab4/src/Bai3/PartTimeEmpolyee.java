package Bai3;

public class PartTimeEmpolyee extends Employee {
private int hoursPerweek;
public PartTimeEmpolyee() {
	
}
public PartTimeEmpolyee(String name, int age, String gender, String employerName, String datehired, int hoursPerweek) {
	super(name, age, gender, employerName, datehired);
	this.hoursPerweek = hoursPerweek;
}
public int getHoursPerweek() {
	return hoursPerweek;
}
public void setHoursPerweek(int hoursPerweek) {
	this.hoursPerweek = hoursPerweek;
}
@Override
public String toString() {
	return super.toString()+ "\n hoursPerweek: " + hoursPerweek ;
}



		 
	 
	

}
