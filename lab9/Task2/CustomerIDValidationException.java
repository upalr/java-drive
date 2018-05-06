
/**
 * HandelException for invalid user input
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class CustomerIDValidationException extends Exception
{
    /**
     * Exception for customer ID validation
     */
    public CustomerIDValidationException( )
    {
        super("Customer ID must start with a letter and should be followed by four digits!");
    }
    
    /**
     * Exception for customer ID validation
     */
    public CustomerIDValidationException(String message)
    {
        super(message);
    }
}

