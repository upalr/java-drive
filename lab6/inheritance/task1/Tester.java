
/**
 * Tester is the class for testing different types of documents 
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Tester
{
    // create two object of type Email and two of type File
    private static Email firstProjectEmail = new Email("Upal", "Shovon", "First project status", "First project completed");
    private static Email secondProjectEmail = new Email("Upal", "Shovon", "Second project status", "Second project ongoing");
    private static File firstProjectFile = new File("C:\\Desktop\\firstProjectJavaDoc.txt", "First project's javadoc");
    private static File secondProjectFile = new File("C:\\Desktop\\secondProjectJavaDoc.txt", "Second project's javadoc");  
        
    public static void main(String[] args){
        System.out.println();
        System.out.println("Checking the first project email body contains the keyword 'First' or not..");
        if(ContainsKeyword(firstProjectEmail, "First"))
            System.out.println("keyword found in the email body");
        else
            System.out.println("keyword not found in the email body");
        
        System.out.println();
        

        System.out.println("Checking the second project email body contains the keyword 'First' or not..");
        if(ContainsKeyword(secondProjectEmail, "First"))
            System.out.println("keyword found in the email body");
        else
            System.out.println("keyword not found in the email body");
        
        System.out.println();
            
        System.out.println("Checking the first project file contains the keyword 'First' or not..");
        if(ContainsKeyword(firstProjectFile, "First"))
            System.out.println("keyword found in the file body");
        else
            System.out.println("keyword not found in the file body");
        
        System.out.println();
        
        System.out.println("Checking the second project file contains the keyword 'First' or not..");
        if(ContainsKeyword(secondProjectFile, "First"))
            System.out.println("keyword found in the file body");
        else
            System.out.println("keyword not found in the file body");
            
    }
    
    /**
     * Checking a specific keyword in document's text
     *
     * @param  docObject  first paramter of ContainsKeyword method. Represents Document object
     * @param  keyword    second paramter of ContainsKeyword method. Represents keyword
     * @return  boolean   if keayword found in the document text then return true. Otherwise return false
     */
    public static boolean ContainsKeyword(Document docObject, String keyword) 
    { 
        if (docObject.toString().indexOf(keyword,0) >= 0) 
            return true ; 
        return false ; 
    }
}
