
/**
 *  Employee class for modeling real employee.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Employee
{
   // instance variables - id, name and salary represent id, name and salary of each employee respectively
   private int id;
   private String name;
   private double salary;
    
    
   /**
    * Changes the id of this Employee.
    * 
    * @param id This Employee's new id.  
    */
   public void setId(int id) {
      this.id = id;
   }

   /**
    * Gets the id of this Employee.
    * 
    * @return this Employee's id.
    */
   public int getId() {
      return id;
   }
    
    /**
     * Changes the name of this Employee.
     * 
     * @param name This Employee's new name.  
     */
    public void setName(String name) {
       this.name = name;
    }

    /**
     * Gets the name of this Employee.
     * 
     * @return this Employee's name.
     */
    public String getName() {
       return name;
    }
    
    /**
     * Changes the salary of this Employee.
     * 
     * @param salary This Employee's new salary.  
     */
    public void setSalary(double salary) {
       this.salary = salary;
    }

    /**
     * Gets the salary of this Employee.
     * 
     * @return this Employee's salary.
     */
    public double getSalary() {
       return salary;
    }
    
    /**
     * Constructor for objects of class Employee
     */
    public Employee(int id, String name, double salary)
    {
       // initialise instance variables - id,name and salary
       this.id = id;
       this.name = name;
       this.salary = salary;
    }

    /**
     * String representation of employee object.
     *
     * @return this Employee's string representation  
     */
    @Override
    public String toString()
    {
       // put your code here
       return "Employee's id: " + id + ", name: " + name +" and salary: "+ salary;
    }
}
