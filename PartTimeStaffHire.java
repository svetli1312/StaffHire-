
/**
 * Part Time Staff Hire is a sub class of StaffHire
 *
 * @author Svetlozar Karpuski / London Metropolitan
 * 
 */
//4 instance variables
public class PartTimeStaffHire extends StaffHire
{
    // working hours given a value of 0, so they can be checked using conditional statement 
    private double workingHour = 0;
    private double wagesPerHour;
    private String shifts; 
    private boolean terminated;
//constructor 
public PartTimeStaffHire(int newVacancyNumber, String newDesignation, String newjobType,
String newStaffName, String newJoinDate, String newQualification, String newAppointedBy,
boolean newJoined,double newworkingHour, double newwagesPerHour, String newShifts)
{ 
    //a call to the superclass constructor 
  super(newVacancyNumber , newDesignation, newjobType, newStaffName, newJoinDate, 
  newQualification, newAppointedBy, newJoined);
    workingHour = newworkingHour; 
    wagesPerHour = newwagesPerHour; 
    shifts = newShifts;
    terminated = false; 
    //terminated placed on false, so it can be changed using the terminate staff
}
//mutator to change shifts 
public void setShifts(String newShifts)
{
    this.shifts = newShifts;
}
//mutator to change workingHours
public void setWorkingHour(double newWorkingHour)
{
    this.workingHour = newWorkingHour;
}
//mutator to change wagesPerHour
public void setWagesPerHour(double newWagesPerHour)
{
    this.wagesPerHour = newWagesPerHour;
}
//accessor returns shifts
public String getShifts()
{
    return shifts;
}
//accessor returns workingHours
public double getWorkingHour()
{
    return workingHour;
}
//accessor returns wages per hour
public double getWagesPerHour()
{
    return wagesPerHour;
}
//accessor returns terminated status - true/false
public boolean getTerminated()
{
    return terminated;
}
//method to terminate staff, if staff has not been terminated yet, calls the superclass mutators and changes them to empty string 
public void terminateStaff(boolean pterminated)
{
 if (terminated == true){ 
     System.out.println("The person has already been terminated");
 }
 else{
     super.setStaffName("");
     super.setJoiningDate("");
     super.setQualification("");
     super.setAppointedBy("");
     super.setJoined(false);
     terminated = true; 
 }
}
//display method, calling the superclass display method only if the working hours are set
public void display()
{
    if (workingHour > 0){
        super.display();
        System.out.println( "Working Hours " + workingHour); 
        System.out.println( "Wage per hour " + wagesPerHour); 
        System.out.println( "Shifts " + shifts); 
        System.out.println( "Terminated " + terminated);
        System.out.println( "Income per day " + (workingHour * wagesPerHour));
    }
    else {
        System.out.println("There are no working hours set");
    }
    
    
}
}

