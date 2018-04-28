
/**
 * Tester is the class for testing different types of persons 
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Tester
{
    // create two object of type Student and two of type Teacher
    private static Student firstStudent = new Student("Upal", "Roy", 101918586, "OOP", "Tony");
    private static Student secondStudent = new Student("Shovon", "Roy", 101928586, "OOP", "Tony"); 
    private static Teacher firstTeacher = new Teacher("Shibbir", "Hossain", "OOP", 2343.23);
    private static Teacher secondTeacher = new Teacher("Tanvir", "Khan", "OOP", 2383.23);
        
    public static void main(String[] args){
        System.out.println();
        System.out.println("First student's details: ");
        System.out.println(firstStudent.displayDetails());
        
        System.out.println();
        System.out.println("Second student's details: ");
        System.out.println(secondStudent.displayDetails());
        
        System.out.println();
        System.out.println("First teacher's details: ");
        System.out.println(firstTeacher.displayDetails());
        
        System.out.println();
        System.out.println("Second teacher's details: ");
        System.out.println(secondTeacher.displayDetails());
    }
    
}
