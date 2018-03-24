
/**
 * Task class for modeling employees' task.
 *
 * @author Upal Roy
 * @version 1.0.0s
 */
public class Task
{
    // instance variables - id, name and  represent id, name of task respectively
    private int id;
    private String name;
    
    /**
     * Changes the id of this Task.
     * 
     * @param id This Task's new id.  
     */
    public void setId(int id){
        this.id = id;
    }  
    
    /**
     * Gets the id of this Task.
     * 
     * @return this Task's id.
     */
    public int getId(){
        return id;
    }
    
    /**
     * Changes the name of this Task.
     * 
     * @param name This Task's new name.  
     */
    public void setName(String name){
        this.name = name;
    }  
    
    /**
     * Gets the name of this Task.
     * 
     * @return this Task's name.
     */
    public String getName(){
        return name;
    }
   
    /**
     * Constructor for objects of class Task
     */
    public Task(int id, String name)
    {
       // initialise instance variables - id and name
       this.id = id;
       this.name = name;
    }
}
