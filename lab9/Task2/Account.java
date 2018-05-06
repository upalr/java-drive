
/**
 * Account class represents real Bank Account
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Account
{
    // instance variables - accountNumber, balance and customerID represent accountNumber, balance and customerID of each Account respectively
    private int accountNumber;
    private double balance;
    private String customerID;

    /**
     * Gets the accountNumber of this Account
     * 
     * @return this Account's accountNumber
     */
    public int getAccountNumber() {
       return accountNumber;
    }
    
    /**
     * Changes the accountNumber of this Account
     * 
     * @param accountNumber This Account's new accountNumber 
     */
    public void setAccountNumber(int accountNumber) {
       this.accountNumber = accountNumber;
    }
    
    /**
     * Gets the balance of this Account
     * 
     * @return this Account's balance
     */
    public double getBalance() {
       return balance;
    }
    
    /**
     * Changes the balance of this Account
     * 
     * @param balance This Account's new balance 
     */
    public void setBalance(double balance) {
       this.balance = balance;
    }
    
    /**
     * Gets the customerID of this Account
     * 
     * @return this Account's customerID
     */
    public String getCustomerID() {
       return customerID;
    }
    
    /**
     * Changes the customerID of this Account
     * 
     * @param customerID This Account's new customerID 
     */
    public void setCustomerID(String customerID) {
       this.customerID = customerID;
    }
    
    /**
     * Constructor for objects of class Account
     */
    public Account(int accountNumber, double balance, String customerID)
    {
        // initialise instance variables - accountNumber, balance and customerID
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerID = customerID;
    }
    
    /**
     * Deposit amount to this acount
     * 
     * @param depositAmount This Account's new amount for deposit 
     */
    public void amountdeposit(double depositAmount){
        try
        {
            if (balance + depositAmount > 5000)
               throw new DepositBalanceBoundaryException();
            else
                balance = balance + depositAmount;
        }
           catch(DepositBalanceBoundaryException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Withdraw amount from this acount
     * 
     * @param withdrawAmount This Account's new amount for withdraw 
     */
    public void amountWithdraw(double withdrawAmount){
        try
        {
            if (balance - withdrawAmount < 500)
               throw new WithdrawBalanceBoundaryException();
            else
                 balance = balance - withdrawAmount;
        }
        catch(WithdrawBalanceBoundaryException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * String representation of Account object.
     *
     * @return this Account's string representation  
     */
    public String toString()
    {
        return "Account Number: " + accountNumber + ", Balance: " + balance + ", Customer ID: " + customerID; 
    }
}
