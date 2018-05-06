
/**
 * HandelException for invalid user input
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class WithdrawBalanceBoundaryException extends Exception
{
    /**
     * Exception for withdraw balance boundary validation
     */
    public WithdrawBalanceBoundaryException()
    {
        super("The available balance after the withdrawal does not go below $500!");
    }
    
    /**
     * Exception for withdraw balance boundary validation
     */
    public WithdrawBalanceBoundaryException(String message)
    {
        super(message);
    }
}

