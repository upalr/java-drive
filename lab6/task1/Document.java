
/**
 * Document class for modeling real Document.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Document
{
   // instance variables - text represent text of each document respectively
   private String text;
    
   /**
    * Changes the text of this Document
    * 
    * @param text This Document's new text 
    */
   public void setText(String text) {
      this.text = text;
   }
   
    /**
     * Constructor for objects of class Document
     */
    public Document(String text)
    {
        // initialise instance variables - text
        this.text = text;
    }

    /**
     * String representation of Document object.
     *
     * @return this Document's string representation  
     */
    @Override
    public String toString()
    {
        return text;
    }
}
