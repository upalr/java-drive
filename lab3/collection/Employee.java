import java.util.*;

/**
 *  Employee class for modeling real employee.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Employee
{
   // instance variables - id, name, salary and taskList represent id, name,salary and taskList of each employee respectively
   private int id;
   private String name;
   private double salary;
   private ArrayList<Task> taskList; 

    
   /**
    * Changes the id of this Employee
    * 
    * @param id This Employee's new id 
    */
   public void setId(int id) {
      this.id = id;
   }

   /**
    * Gets the id of this Employee
    * 
    * @return this Employee's id
    */
   public int getId() {
      return id;
   }
    
    /**
     * Changes the name of this Employee
     * 
     * @param name This Employee's new name 
     */
    public void setName(String name) {
       this.name = name;
    }

    /**
     * Gets the name of this Employee
     * 
     * @return this Employee's name
     */
    public String getName() {
       return name;
    }
    
    /**
     * Changes the salary of this Employee
     * 
     * @param salary This Employee's new salary  
     */
    public void setSalary(double salary) {
       this.salary = salary;
    }

    /**
     * Gets the salary of this Employee
     * 
     * @return this Employee's salary
     */
    public double getSalary() {
       return salary;
    }
    
    /**
     * Constructor for objects of class Employee
     */
    public Employee(int id, String name, double salary)
    {
       // initialise instance variables - id,name and salary
       this.id = id;
       this.name = name;
       this.salary = salary;
       taskList = new ArrayList<Task>();
    }

    /**
     * String representation of employee object.
     *
     * @return this Employee's string representation  
     */
    @Override
    public String toString()
    {
       return "Employee's id: " + id + ", name: " + name +" and salary: "+ salary;
    }
    
    /**
     * Add tasks to employee's list 
     *
     * @param  taskId  first paramter of addTask method. Represents task's id
     * @param  taskName second paramter of addTask method. Represents task's name
     */
    public void addTask(int taskId, String taskName){
        Task newTask = new Task(taskId, taskName);
        taskList.add(newTask);
    }
    
    /**
     * Find a task from employee's list 
     *
     * @param  taskId  first paramter of addTask method. Represents task's id
     * @return  task  the task if matches with the taskid. Otherwise return null
     */
    public Task findTask(int taskId){
       for(Task task : taskList) {
           if(task.getId() == taskId){
               return task;
            }
       }
       return null;
    }
    
    /**
     * Number of tasks associated with the employee 
     *
     * @return  the the number of tasks in the taskList
     */
    public int getNumberOfTasks(){
        return taskList.size();
    }
    
    /**
     * Delete a task from employee's list 
     *
     * @param  taskId  first paramter of addTask method. Represents task's id
     * @return  boolean  if task successfully removerd then return true . Otherwise return false
     */
    public boolean deleteTask(int taskId){
        Task foundTask = findTask(taskId); 
        if(foundTask != null){
            taskList.remove(foundTask);
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Provide all tasks from employee's list 
     *
     * @return  taskList  all the tasks associated with the employee
     */
    public ArrayList<Task> getAllTasks(){
        return taskList;
    }
    
    /**
     * Provide a task from employee's list matching the index 
     *
     * @param  index  first paramter of addTask method. Represents index of the taskList
     * @return  task  Return task if it matches with the index
     */
    public Task getAtIndex(int index){
        return taskList.get(index);
    }
}
