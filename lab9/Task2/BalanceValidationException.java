
/**
 * HandelException for invalid user input
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class BalanceValidationException extends Exception
{
    /**
     * Exception for balance amount validation
     */
    public BalanceValidationException( )
    {
        super("Initial balance must be above $500!");
    }
    
    /**
     * Exception for balance amount validation
     */
    public BalanceValidationException(String message)
    {
        super(message);
    }
}

