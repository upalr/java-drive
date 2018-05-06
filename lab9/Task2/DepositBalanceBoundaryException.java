
/**
 * HandelException for invalid user input
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class DepositBalanceBoundaryException extends Exception
{
    /**
     * Exception for deposit balance boundary validation
     */
    public DepositBalanceBoundaryException( )
    {
        super("After the deposit, the maximum balance in the account must not be more than $5000!");
    }
    
    /**
     * Exception for deposit balance boundary validation
     */
    public DepositBalanceBoundaryException(String message)
    {
        super(message);
    }
}

