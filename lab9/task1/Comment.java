import java.util.*;

/**
 * Comment class for modeling real comment.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Comment
{
    // instance variables - id and description represent id and description of each Comment respectively 
    private int id;
    private String description;
    private static int i = 1;
    
    /**
     * Gets the id of this Comment
     * 
     * @return this Comment's id
     */
    public int getId() {
       return id;
    }
    
    /**
     * Changes the id of this Comment
     * 
     * @param id This Comment's new id 
     */
    public void setId(int id) {
       this.id = id;
    }
    
    /**
     * Gets the description of this Comment
     * 
     * @return this Comment's description
     */
    public String getDescription() {
       return description;
    }
    
    /**
     * Changes the description of this Comment
     * 
     * @param description This Comment's new description 
     */
    public void setDescription(String name) {
       this.description = description;
    }
    
    /**
     * Constructor for objects of class Comment
     */
    public Comment(int id, String description)
    {
        // initialise instance variables - id and description
        this.id = id;
        this.description = description;
        i++;
    }
    
    /**
     * Constructor for objects of class Comment
     */
    public Comment(String description)
    {
        // initialise instance variables - id and description
        this.id = i++;
        this.description = description;

    }
    
    /**
     * Save Commest's  data as Strings
     * params dataList data for save in file 
     */
    public void saveComment(ArrayList<String> dataList){
        dataList.add(id + "," + description);
    }
}
