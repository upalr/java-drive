
/**
 * Teacher class for modeling real Teacher.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Teacher extends Person
{
   // instance variables - subjectName and salary represent subject name and salary of each Teacher respectively
   private String subjectName;
   private double salary;
    
   /**
    * Changes the subject name of this Teacher
    * 
    * @param subjectName This Teacher's new subject name 
    */
   public void setSubjectName(String subjectName) {
      this.subjectName = subjectName;
   }
   
   /**
    * Gets the subjectName of this Teacher
    * 
    * @return this Teacher's subjectName
    */
   public String getSubjectName() {
      return subjectName;
   }
   
    /**
    * Changes the salary of this Teacher
    * 
    * @param salary This Teacher's new salary 
    */
   public void setSalary(double salary) {
      this.salary = salary;
   }
   
   /**
    * Gets the salary of this Teacher
    * 
    * @return this Teacher's salary
    */
   public double getSalary() {
      return salary;
   }
   
    /**
     * Constructor for objects of class Teacher
     */
    public Teacher(String firstName, String lastName, String subjectName, double salary)
    {
        // initialise instance variables - firstName, lastName, subjectName and salary
        super(firstName, lastName);
        this.subjectName = subjectName;
        this.salary = salary;
    }

   /**
    * String representation of Teacher object.
    *
    * @return this Teacher's string representation  
    */
   public String displayDetails()
   {
       // put your code here
       return super.displayDetails() + " ,Subject Name: " +subjectName + " ,Salary: " + salary;
   }
}
