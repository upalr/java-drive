import java.util.Scanner;

/**
 * This class implements the console user interface to handle user input and invoke appropriate business logic methods to add, delete, list and find car part details.
 * 
 * @author Shamara Gibson
 * @version 1.0
 * 
 */

public class UserInterface
{
    // instance variables - replace the example below with your own
    private Car theCar;
  
    /**
     * Consotructor for UserInterface class
     * 
     * @param aCar the Car object to be initialised
     */
    public UserInterface(Car aCar)
    {
        // initialise instance variables
        this.theCar = aCar; 
    }
  
    /**
     * Calls the appropriate UI method based on user selection.
     */
    public void run()
    {
        while(true)
            switch (menu() ) 
            {
                    case 1:
                        addPart();
                        break;
                    case 2:
                        deletePart();
                        break;
                    case 3:
                        listParts();
                        break;
                     case 4:
                        findPart();
                        break;
                     case 5:
                        return;   
                     default:
                        System.out.println ( "Unrecognized option" );
                        break;
            }
    }
    
    /**
     * Prints the user interface menu
     * 
     * @return int returns the option user has picked
     */
    private int menu()
    {   
            System.out.println("1) Add Part");
            System.out.println("2) Delete Part");
            System.out.println("3) List Parts");
            System.out.println("4) Find Part");
            System.out.println("5) Exit");
            return IOUtility.getInteger("Select Option: ");
     }
    
     /**
      * Prompts the user for part details to be added, creates a Part object and adds it to the Car.
      */
    private void addPart()
    {
        // get details
        double cost;
        String description;
        String number;
        IOUtility.println("Create new part");
        IOUtility.println("");
        
        description = IOUtility.getString("Enter Description:");
        cost = IOUtility.getDouble("Enter cost:");
        number = IOUtility.getString("Enter part number:");
        theCar.addPart( new Part(description,cost,number));
    }
    
    /**
     * Prints all car part details.
     */
    private void listParts()
    {
       //list to screen
       for(Part p : theCar.getAllParts())
       {
           IOUtility.println(p.toString());
       }
    }   
    
    /**
     * Prompts the user to enter the part number to delete, finds it and removes it.
     */
    private void deletePart()
    {
        String find;
        find = IOUtility.getString("Enter Number of part you wish delete:");
        Part p = theCar.findPart(find);
        if (p == null)
            IOUtility.println("Part not found");
        else
        {
              IOUtility.println(p.toString());
              theCar.removePart(p);
              IOUtility.println("Part Deleted");
        }       
    }
    
    /**
     * Prompts the user to enter the part number for searching, finds it and prints it.
     */
    private void findPart()
    {
        String find;
        find = IOUtility.getString("Enter Number of part you wish to find:");
        Part p = theCar.findPart(find);
        if (p == null)     
            IOUtility.println("Part not found");
        else
            IOUtility.println(p.toString());
    }
            
}
