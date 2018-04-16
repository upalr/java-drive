
/**
 * Person class for modeling real Person.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Person
{
   // instance variables - firstName and lastName represent first name and last name of each person respectively
   private String firstName;
   private String lastName;
    
    /**
    * Changes the first name of this Person
    * 
    * @param firstName This person's new first name 
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   
   /**
    * Gets the first name of this Person
    * 
    * @return this Person's first name
    */
   public String getFirstName() {
      return firstName;
   }
   
   /**
    * Changes the last name of this Person
    * 
    * @param lastName This Person's new last name 
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   /**
    * Gets the last name of this Person
    * 
    * @return this Person's last name
    */
   public String getLastName() {
      return lastName;
   }
    
   /**
    * Constructor for objects of class Person
    */
   public Person(String firstName, String lastName)
   {
       // initialise instance variables - firstName and lastName
       this.firstName = firstName;
       this.lastName = lastName;
   }

   /**
    * String representation of Person object.
    *
    * @return this Person's string representation  
    */
   public String displayDetails()
   {
       return "First name: " + firstName+ " ,Last name: " + lastName;
   }
}
