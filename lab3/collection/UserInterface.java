import java.util.Scanner;
import java.util.*;

/**
 * UserInterface is the class for managing the tasks of the employees 
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class UserInterface
{
    //instance object - to referance a employee.
    static Employee employee = new Employee(20, "Upal", 100.23);
    //instance object - to referance a Scanner.
    static Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args){
        
        while(true){
            System.out.println();
            System.out.println("1. Add a Task");
            System.out.println("2. Find a Task");
            System.out.println("3. Total number Task");
            System.out.println("4. Remove a Task");
            System.out.println("5. Print all Task");
            System.out.println("0. Stop the Program.");
            System.out.println("Select your choice by entering number:");
        
            int choiceNumber = sc.nextInt(); //scan choice number   

            if (choiceNumber == 0){
                System.out.println("Program Stopped.");
                break;
            }
            else if(choiceNumber == 1)
                addTask();
            else if(choiceNumber == 2)
                findTask();
            else if(choiceNumber == 3)
                getNumberOfTasks();
            else if(choiceNumber == 4)
                deleteTask();
            else if(choiceNumber == 5)
                getAllTasks();    
        }
    }
    
    /**
     * Add tasks to employee's list after taking input from user
     *
     */
    public static void addTask(){
        System.out.println("Enter task id:");
        int taskId = sc.nextInt(); // scan task id
        
        sc.nextLine(); 
        
        System.out.println("Enter your Task Name:");
        String taskName = sc.nextLine();  // scan task name   
        employee.addTask(taskId, taskName);
        System.out.println("New task added successfully.");
    }
    
    
    /**
     * Find a task from employee's list after taking input from user
     *
     */
    public static void findTask(){
        System.out.println("Enter task id for searching:");
        int taskId = sc.nextInt();  // scan task id
        Task foundTask = employee.findTask(taskId); // find the task and assign it 
        if(foundTask == null)
            System.out.println("No task found for this taskId");
        else 
            System.out.println("Task has Found. The task id: "+ foundTask.getId() + " and name: " + foundTask.getName());
    }
    
    
    /**
     * get the number of tasks from employee's list
     *
     */
    public static void getNumberOfTasks(){
        int numberOfTask = employee.getNumberOfTasks(); //get the number of task
        System.out.println("The number of task is: "+ numberOfTask);
    }
    
    /**
     * delete a task from employee's list after taking input from user
     * 
     */
    public static void deleteTask(){
        System.out.println("Enter task id for remove.");
        int taskId = sc.nextInt(); // scan task id
        if(employee.deleteTask(taskId))
            System.out.println("Task has removed successfully.");
        else
            System.out.println("No task availabe to remove with this id.");
    }
    
    /**
     * show all task from employee's list after taking input from user
     *
     */
    public static void getAllTasks(){
        
        ArrayList<Task> allTaskList = employee.getAllTasks(); // all tasks' list of a employee
        
        if(allTaskList.size()>0){
            System.out.println("All Tasks are printed bellow:");
            for(int i = 0; i < allTaskList.size(); i++) {   
                System.out.println("Task id: "+ allTaskList.get(i).getId() +" and name: " + allTaskList.get(i).getName());
            }
        }
        else
        {
            System.out.println("No task available to print.");
        }
        
    }
}


