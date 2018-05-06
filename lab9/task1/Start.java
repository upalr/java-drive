import java.util.*;

/**
 * Mange to start the application
 *
 * @author Upal Roy
 * @version 1.0.0
 */

public class Start
{
    public static void main(String[] args)
    {
        try
        {
            Program program = new Movie("Deadpool 2");
            UserInterface consoleApp = new UserInterface(program);
            consoleApp.run();
            program.saveProgram();
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }    
    }
}