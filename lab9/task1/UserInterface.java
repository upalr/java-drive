import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.time.Duration;

/**
 * UserInterface class for modeling UserInterface.
 * 
 * @author Upal Roy
 * @version 1.0.0
 */
public class UserInterface
{
    private Program program;
    private Scanner sc = new Scanner(System.in);
    
    /**
     * Constructor for objects of class UserInterface
     */
    public UserInterface(Program program)
    {
        this.program = program;
    }
    
    /**
     * Take input  to run applications
     */
    public void run()
    {
        while(true){
            displayComments();
            break;                

        }
    }
    
  
    /**
     * Display comment and add new comment
     */
    private void displayComments()
    {
        ArrayList<Comment> commentList = program.getComments();
        System.out.println("Users' Comments on the Movie:  "+ program.getName());
        
        if(!commentList.isEmpty()){
            for(Comment comment : commentList)
            {

                System.out.println("Comment Number: " + comment.getId() + "\n      " + "Comment:  " + comment.getDescription());
            }
            System.out.println("Write your comment here.....");
        }
        else
        {
            System.out.println("There is no previous comment available on this Program. So be the first person to start comment: ");
        }
         
        

        String commentDescription = "";
        int i = 0;
        while(true){
           String newcomment =  sc.nextLine();
           
           i = i+1;
           
           if(newcomment.isEmpty()){
                System.out.println("Your comment added successfully");
                break;
           }
           
           commentDescription = commentDescription + newcomment + " ";
           
           if(i == 3){
            System.out.println("You have entered maxiam (three) lines of comments."); 
            System.out.println("Your comment added successfully");
            break;
           }  
        }
        Comment newComment = new Comment(commentDescription);
        program.addComment(newComment);
    }
    

} // end class
