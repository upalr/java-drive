import java.util.Scanner;

/**
 * Teste class is responsible for testing different Account Object.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Tester
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int accountNumber = 0; //to keep compiler happy
        boolean done = false;
        
        while (! done)
        {
            try
            {
                System.out.println("Enter account number:");
                accountNumber = keyboard.nextInt();
                if(Integer.valueOf(accountNumber).toString().length() != 6)
                    throw new AccountNumberValidationException();
                    
                done = true;
             }
             catch(AccountNumberValidationException e)
             {
                 System.out.println(e.getMessage());
                 System.out.println("Try again.");
             }
        
        }
        
        keyboard.nextLine();
        done = false;
        double balance = 0.0; //to keep compiler happy
        while (! done)
        {
            try
            {
                System.out.println("Enter initial balance:");
                balance = keyboard.nextDouble();
                if(balance <= 500.00)
                    throw new BalanceValidationException();
                    
                done = true;
             }
             catch(BalanceValidationException e)
             {
                 System.out.println(e.getMessage());
                 System.out.println("Try again.");
             }
        }
        
        
        keyboard.nextLine();
        
        done = false;
        String customerID=""; //to keep compiler happy
        while (! done)
        {
            try
            {
                System.out.println("Enter customer ID:");
                customerID = keyboard.nextLine();

                if(customerID.length() != 5 || !Character.isLetter(customerID.charAt(0)))
                    throw new CustomerIDValidationException();
                    
                for(int i = 1; i < customerID.length(); i++)
                {
                    if(!Character.isDigit(customerID.charAt(i)))
                        throw new CustomerIDValidationException();    
                }
                
                done = true;
             }
             catch(CustomerIDValidationException e)
             {
                 System.out.println(e.getMessage());
                 System.out.println("Try again.");
             }
                         
        }
        
        Account account = new Account(accountNumber, balance, customerID);
        
        System.out.println();
        
        System.out.println("Initial account status:");
        System.out.println(account.toString());
        
        System.out.println();
        System.out.println();
        
        System.out.println("Deposit $500 in the account:");
        account.amountdeposit(500);
        System.out.println("Account Status after depositing $500.");
        System.out.println(account.toString());
        
        System.out.println();
        System.out.println();
        
        System.out.println("Withdraw $200 from the account:");
        account.amountWithdraw(200);
        System.out.println("Account Status after withdraw $200.");
        System.out.println(account.toString());
    }
}
