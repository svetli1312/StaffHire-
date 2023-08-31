
/**
 * Write a description of class StaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 
 public class StaffHire
{
    // instance variables for the class must be set on private
    private int vacancyNumber;
    private String designation;
    private String jobType;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
 //constructur
public StaffHire(int newVacancyNumber, String newDesignation, String newjobType,
String newStaffName, String newJoinDate, String newQualification, String newAppointedBy,
boolean newJoined)

{
    //initializing attributes with values of the constructor's parameters//

    vacancyNumber = newVacancyNumber; 
    designation = newDesignation;
    jobType = newjobType;
    staffName = newStaffName;
    joiningDate = newJoinDate; 
    qualification = newQualification;
    appointedBy = newAppointedBy;
    joined = newJoined;

    
}
//mutator method to change the vacancy number 
public void setVacancyNumber(int pvacancyNumber)
{
    this.vacancyNumber = pvacancyNumber;

}
//mutator method to change the Designation
public void setDesignation(String pDesignation)
{
    this.designation = pDesignation;
}
//set method to change the job type. This method also uses switch and conditional statement so the user can choose only 3 options. 
/**
    * @param jobTypeCode A parameter that ranges between 1 and 3. The explanations are below;
    * permanent 
    * temporary
    * part time
    */
public void setjobType(int pJobType)
{
  if (pJobType > 0 && pJobType < 4)
{
    switch (pJobType) {
        case 1: jobType = "permanent"; break;
        case 2: jobType = "temporary" ; break;
        case 3: jobType = "part time" ; break; 
    }
    System.out.println(jobType);
}
else
{
    System.out.println("You need to type value between 1-4");
}
}
//mutator to change value of staff name 
public void setStaffName(String pStaffName)
{
   this.staffName = pStaffName;
}
//mutator for qualification
public void setQualification(String pQualification)
{
    this.qualification = pQualification;
}
//mutator for joining date 
public void setJoiningDate(String pJoinDate)
{
    this.joiningDate = pJoinDate;
}
//mutator for Appointed By 
public void setAppointedBy(String pAppointedBy)
{
    this.appointedBy = pAppointedBy;
}
//mutator to asing value the joined status 
public void setJoined(boolean joined)
{
    this.joined = joined;
}
//get the vacancy number
public int getVacancyNumber()
{
    return vacancyNumber;
}
//get designation
public String getDesignation()
{
    return designation; 
}
//accessor returns jobType
public String getJobType()
{
    return jobType;
}
//accessor returns staffName
public String getStaffName()
{
    return staffName;
}
//accessor returns qualification
public String getQualification()
{
    return qualification;

}
//accessor returns appointedBy
public String getAppointedBy()
{
    return appointedBy; 

}
//bool - returns true or false 
public boolean getJoined()
{
    return joined; 
}
//display method returns the information if the staff is appointed, if not gives error message. 
public void display()
{
    {
        String className = this.getClass().getName();
        System.out.println(className + " infomration ");
        if(joined == true) {
        System.out.println("Vacancy number: " + vacancyNumber); 
        System.out.println("Designation: " + designation); 
        System.out.println("Job type: " + jobType);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Appointed By: " + appointedBy);
        } else {
            System.out.println("no staff is appointed");
        }
        
    }
}
}
