import java.util.Scanner;

/** Demonstrates what happens when an unchecked exception is caused. */
public class DivideAndCatch {

    public static void main(String[] args) {
        System.out.println("program begins");
        Scanner sc = new Scanner(System.in);
        int number, divisor, answer;
        char goOn = 'y';

        while(goOn == 'y') {
            System.out.println("Enter number to divide");
            number = sc.nextInt();
            System.out.println("Enter number to divide by");
            divisor = sc.nextInt();
            try {
                System.out.println(" I am going to do dividison now..");
                answer = number / divisor;
                
                System.out.println("answer: " + answer);
                    
             } catch (Exception ex) {
                if (ex instanceof ArithmeticException)
                {               
                    //System.out.println("Cannot do that division");
                    System.out.println("This is ex message: " + ex.getMessage());
                }
            }
            System.out.println("Do another? (y/n)");
            goOn = sc.next().charAt(0);
        }
        System.out.println("program over");
    }

}
