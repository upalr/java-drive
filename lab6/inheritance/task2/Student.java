
/**
 * Student class for modeling real Student.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Student extends Person
{
   // instance variables - Id, course and teacherName represent ID and course name and teacher name of each Student respectively
   private int Id;
   private String course;
   private String teacherName;
    
   /**
    * Changes the Id of this Student
    * 
    * @param Id This Student's new Id 
    */
   public void setId(int Id) {
      this.Id = Id;
   }
   
   /**
    * Gets the Id of this Student
    * 
    * @return this Student's Id
    */
   public int getId() {
      return Id;
   }
   
   /**
    * Changes the course of this Student
    * 
    * @param course This Student's new course 
    */
   public void setCourse(String course) {
      this.course = course;
   }
   
   /**
    * Gets the course of this Student
    * 
    * @return this Student's course
    */
   public String getCourse() {
      return course;
   }
   
   /**
    * Changes the teacherName of this Student
    * 
    * @param teacherName This Student's new teacherName 
    */
   public void setTeacherName(String teacherName) {
      this.teacherName = teacherName;
   }
   
   /**
    * Gets the teacherName of this Student
    * 
    * @return this Student's teacherName
    */
   public String getTeacherName() {
      return teacherName;
   }
   
   /**
    * Constructor for objects of class Student
    */
   public Student(String firstName, String lastName, int Id, String course, String teacherName)
   {
       // initialise instance variables - firstName, lastName, Id, course and teacherName
       super(firstName, lastName);
       this.Id = Id;
       this.course = course;
       this.teacherName = teacherName;
   }
    

   /**
   * String representation of Student object.
   *
   * @return this Student's string representation  
   */
   public String displayDetails()
   {
       return super.displayDetails() + " ,StudentID: " + Id + " ,Course: " + course + " ,Teacher Name: " + teacherName;
   }
}
