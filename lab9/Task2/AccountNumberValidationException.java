
/**
 * HandelException for invalid user input
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class AccountNumberValidationException extends Exception
{   
    /**
     * Exception for account number validation
     */
    public AccountNumberValidationException( )
    {
        super("Account number must be of six digits!");
    }
    
    /**
     * Exception for account number validation
     */
    public AccountNumberValidationException(String message)
    {
        super(message);
    }
}

