
/**
 * FullTime staff is a sub class of StaffHire
 *
 * @ Svetlozar Karpuski / London Metropolitan
 * @version (a version number or a date)
 */
//instance variables
public class FullTimeStaff extends StaffHire
{
 
private double salary;
 
private double workingHours;
//constructor
public FullTimeStaff(double pSalary,double pWorkingHours, int newVacancyNumber, String newDesignation, String newJobType,
String newStaffName, String newJoinDate, String newQualification, String newAppointedBy,
boolean newJoined)
//calling the main class variables using "super" 
{
 
super(newVacancyNumber , newDesignation, newJobType, newStaffName, newJoinDate, newQualification, newAppointedBy, newJoined);
 
salary = pSalary;
 
workingHours = pWorkingHours;
 
 
}
//mutator for setSalary, also checks if the joined status is true
public void setSalary(double newSalary)
{
 
if (getJoined() == true)
{
 
salary = newSalary; 
 
} else {
 
System.out.println("This staff is not appointed");
 
}
}
//accessor returns salary
public double getSalary()
{
 
return salary;
}
//mutator for hours, checks if joined status is true
public void setwHours(double newHours)
{
 
if (getJoined() == true)
{
 
workingHours = newHours;
 
}else 
 
{
 
System.out.println("This staff is not appointed");
 
}
}
//accessor returns workingHours
public double getHours()
{
 
return workingHours;
}
//display method activated only if the salary is bigger than 0, calling the super class
public void display()
{ 
 
super.display();
 
if (salary <= 0 )
{
 
System.out.println("There is no salary added");}
 
else
 
{
 
System.out.println("Salary " + salary);
 
System.out.println("working Hours " + workingHours); }
}
}