
/**
 * Email class for modeling real Email.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Email extends Document
{
   // instance variables - sender, recipient and title represent sender, recipient and title of each email respectively
   private String sender;
   private String recipient;
   private String title;
    
    /**
    * Changes the sender of this Email
    * 
    * @param sender This Email's new sender 
    */
   public void setSender(String sender) {
      this.sender = sender;
   }
   
   /**
    * Gets the sender of this Email
    * 
    * @return this Email's sender
    */
   public String getSender() {
      return sender;
   }
   
   /**
    * Changes the recipient of this Email
    * 
    * @param recipient This Email's new recipient 
    */
   public void setRecipient(String recipient) {
      this.recipient = recipient;
   }
   
   /**
    * Gets the recipient of this Email
    * 
    * @return this Email's recipient
    */
   public String getRecipient() {
      return recipient;
   }
   
   
   /**
    * Changes the title of this Email
    * 
    * @param title This Email's new title 
    */
   public void setTitle(String title) {
      this.title = title;
   }
   
   /**
    * Gets the title of this Email
    * 
    * @return this Email's title
    */
   public String getTitle() {
      return title;
   }
   
   /**
    * Constructor for objects of class Email
    */
   public Email(String sender, String recipient, String title, String eamilBody)
   {
       // initialise instance variables - sender, recipient, title and emailBody
       super(eamilBody);
       this.sender = sender;
       this.recipient = recipient;
       this.title = title;

   }
    
   /**
    * String representation of Email object.
    *
    * @return this Email's string representation  
    */
   @Override
   public String toString(){
       return "Sender: " + sender + "Receipent: " + recipient + "Title: " + title + "Body: " + super.toString();
   } 
}
