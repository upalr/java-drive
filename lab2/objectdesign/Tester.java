
/**
 * Tester class for testing the Employee class.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Tester
{
    //instance object - to referance a employee.
    static Employee employee = new Employee(20, "Upal", 100.23);
    
    public static void main(String[] args){
     int countSuccess = 0; // counts test success
     int countFail = 0;  //counts test fail
     
     if(testGetId()){
        System.out.println("Test successfully passed");
        System.out.println();
        countSuccess++;
     }
     else {
        System.out.println("Test Failed");
        System.out.println();
        countFail++;
     }
     
     if(testToString()){
        System.out.println("Test successfully passed");
        System.out.println();
        countSuccess++;
     }
     else {
        System.out.println("Test Failed");
        System.out.println();
        countFail++;
     }
        
     if(testSetSalary()){
        System.out.println("Test successfully passed");
        System.out.println();
        countSuccess++;
     }
     else {
        System.out.println("Test Failed");
        System.out.println();
        countFail++;
     }
     
     if(testSetName()){
        System.out.println("Test successfully passed");
        System.out.println();
        countSuccess++;
     }
     else {
        System.out.println("Test Failed");
        System.out.println();
        countFail++;
     }
        
     System.out.println("Test success: " + countSuccess);
     System.out.println("Test Fails: " + countFail);
    }
    
    /**
     * Test getId method of Employee.
     * 
     * @return Return boolean. if test pass then true otherwise false.
     */
    public static boolean testGetId(){
        System.out.println("Testing getId method.");
        int expectedEmployeeId = 20;
        int id = employee.getId();
        System.out.println("Initial Employee Id was " + id);
        System.out.println("Expected result is " + expectedEmployeeId);
        System.out.println("Actual result is " + id);
        
        if(id == expectedEmployeeId)
            return true;
        else
            return false;
    }
    
    /**
     * Test setName method of Employee.
     * 
     * @return Return boolean. if test pass then true otherwise false.
     */
    public static boolean testSetName()
    {
        System.out.println("Testing setName method.");
        String expectedEmployeeName = "Shovon";
        System.out.println("Initial Employee name was " + employee.getName() + " and set the name to " + expectedEmployeeName);
        employee.setName(expectedEmployeeName);
        String newName = employee.getName();
        System.out.println("Expected result is " + expectedEmployeeName);
        System.out.println("Actual result is " + newName);
        
        if(newName.equals(expectedEmployeeName))
            return true;
        else
            return false;
    }
    
    /**
     * Test setSalary method of Employee.
     * 
     * @return Return boolean. if test pass then true otherwise false.
     */
    public static boolean testSetSalary()
    {
        System.out.println("Testing setSalary method.");
        double expectedEmployeeSalary = 250.04;
        System.out.println("Initial Employee salary was " + employee.getSalary() + " and set the salary to " + expectedEmployeeSalary);
        employee.setSalary(expectedEmployeeSalary);
        double newSalary = employee.getSalary();
        System.out.println("Expected result is " + expectedEmployeeSalary);
        System.out.println("Actual result is " + newSalary);
        
        if(newSalary == expectedEmployeeSalary)
            return true;
        else
            return false;
    }
    
    /**
     * Test toString method of Employee.
     * 
     * @return Return boolean. if test pass then true otherwise false.
     */
    public static boolean testToString()
    {
        System.out.println("Testing toString method.");
        System.out.println("Initial Employee object representation: " + employee.toString());
        String expectedObjRepresentation = "Employee's id: 20, name: Upal and salary: 100.23";
        String empolyeeObjRepresentation = employee.toString();
        System.out.println("Expected Employee object representation: " + expectedObjRepresentation);
        System.out.println("Actual Employee object representation: " + empolyeeObjRepresentation);
        if(empolyeeObjRepresentation.equals(expectedObjRepresentation))
            return true;
        else
            return false;
    }
    
}
