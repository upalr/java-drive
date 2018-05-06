/**
 * This class is responsible to start the application.
 * 
 * @author Shamara Gibson
 * @version 1.0
 */ 
public class Start
{
    /**
     * The application starts execution from this method.
     * The console UserInterface is called from this method.
     * 
     */
    public static void main(String[] args)
    {
       try
       {
            Car c = new Car();
            UserInterface UI = new UserInterface(c);
            UI.run();    
            c.saveCar();
        }
        catch (Exception ex) //A better approach is to have seperate handlers to handle specific exceptions
        {
            System.out.println(ex);
        }
         
    }
}// end start