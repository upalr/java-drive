
/**
 * Fiel class for modeling real File.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class File extends Document
{
   // instance variables - pathName represent path name of each file respectively
   private String pathName;
    
   /**
    * Changes the path name of this File
    * 
    * @param pathName This File's new path name 
    */
   public void setPathName(String pathName) {
      this.pathName = pathName;
   }
   
   /**
    * Gets the path name of this File
    * 
    * @return this File's path name
    */
   public String getPathName() {
      return pathName;
   }
   
   /**
    * Constructor for objects of class File
    */
   public File(String pathName, String fileContent)
   {
       // initialise instance variables - pathName, fileContent
       super(fileContent);
       this.pathName = pathName;
   }
    
   /**
    * String representation of File object.
    *
    * @return this File's string representation  
    */
   @Override 
   public String toString(){
       return "Path Name: " + pathName + "File Content: " + super.toString();
   }
    
}
