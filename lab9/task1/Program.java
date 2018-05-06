import java.util.*;
import java.io.*;

/**
 * Program class for modeling real Entertainment Program.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Program
{
    // instance variables - name and commentList represent name, comment list of each Program respectively 
    private String name;
    private ArrayList<Comment> commentList;
    
    /**
     * Gets the name of this Program
     * 
     * @return this Program's name
     */
    public String getName() {
       return name;
    }
    
    /**
     * Changes the name of this Program
     * 
     * @param name This Program's new name 
     */
    public void setName(String name) {
       this.name = name;
    }
    
    /**
     * Constructor for objects of class Program
     */
    public Program(String name)
    {
        // initialise instance variables - name and commentList
        this.name = name;
        commentList = new ArrayList<Comment>();
        try
        {
            getCommentsFromFile();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    /**
     * A method to collect program comments data as Strings and save to a file.
     */
    public void saveProgram() throws IOException
    {
        ArrayList<String> dataList = new ArrayList<String>();
    
        for(Comment comment : commentList)
        {
            comment.saveComment(dataList);
        }
        
        FileUtility.writeToFile("programData.txt", dataList);
    }
    
    /**
     * Read member data from file and build Comment objects.
     */
    public void getCommentsFromFile()throws IOException, FileNotFoundException
    {
        ArrayList<String> linesList = FileUtility.readFromFile("programData.txt");
    
        for(String currentLine : linesList)
        {
            String[] commentInfo = currentLine.split(",");
            commentList.add(new Comment(Integer.parseInt(commentInfo[0]), commentInfo[1]));
        }
    }
    
    /**
     * Add new comment to this Program
     * 
     * @param newComment This Program's new Comment 
     */
    public void addComment(Comment newComment){
        commentList.add(newComment);
    }
    
    
    /**
     * Provide the comments added to the program 
     * 
     * @return this Program's List of comment
     */
    public ArrayList<Comment> getComments()
    {
        return commentList;
    }
}
