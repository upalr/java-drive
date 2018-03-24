import java.util.*;

/**
 * MCQ class for modeling real MCQ question for test paper.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class MCQ
{
   // instance variables - id, description and choiceList represent id, description and list of choice of each MCQ respectively
   private int id;
   private String description;
   private ArrayList<Choice> choiceList;
   
   /**
    * Changes the id of this MCQ
    * 
    * @param id This MCQ's new id 
    */
   public void setId(int id) {
      this.id = id;
   }
   
   /**
    * Gets the id of this MCQ
    * 
    * @return this MCQ's id
    */
   public int getId() {
      return id;
   }
   
   /**
    * Changes the description of this MCQ
    * 
    * @param description This MCQ's new description 
    */
   public void setDescription(String description) {
      this.description = description;
   }
   
   /**
    * Gets the description of this MCQ
    * 
    * @return this MCQ's description
    */
   public String getDescription() {
      return description;
   }
   
   /**
    * Constructor for objects of class MCQ
    */
   public MCQ(int id, String Description)
   {
       // initialise instance variables - id, description and choiceList
       this.id = id;
       this.description = description;
       choiceList = new ArrayList<Choice>();
   }
   
   /**
    * Provide all Choices from MCQ's list 
    *
    * @return  choiceList all the choices associated with the MCQ
    */
   public ArrayList<Choice> getAllChoices(){
        return choiceList;
   }
   
   /**
    * Find the correct Choice for MCQ 
    *
    * @return  choice  return the choice if it is the correct ans. Otherwise return null
    */
   public Choice findTheCorrectChoice(){
       for(Choice choice : choiceList) {
           if(choice.getCorrectAns() == true){
               return choice;
            }
       }
       return null;
   }
   
   /**
    * Add Choices to MCQ's list 
    *
    * @param  newChoice  first paramter of addChoice method. Represents new Choice object 
    */ 
   public boolean addChoice(Choice newChoice){
       if(choiceList.size() < 5){
          choiceList.add(newChoice);
          return true;
        }
        else
          return false;
    }
   
   /**
    * Remove a choice from MCQ's list 
    *
    * @param  choiceId  first paramter of removeChoice method. Represents choice's id
    * @return  boolean  if choice successfully removerd then return true . Otherwise return false
    */ 
   public boolean removeChoice(int choiceId){
       Choice foundChoice = findChoice(choiceId); 
       if(foundChoice != null){
           if(choiceList.size() > 3){
              choiceList.remove(foundChoice);
              return true;
           }
           else {
               return false;
           }
       }
       else {
           return false;
       }
   }
   
   /**
    * Find a Choice from MCQ's list 
    *
    * @param  choiceId  first paramter of findChoice method. Represents choice's id
    * @return  choice  return the choice if matches with the choiceId. Otherwise return null
    */
   public Choice findChoice(int choiceId){
      for(Choice choice : choiceList) {
          if(choice.getId() == choiceId){
              return choice;
          }
      }
      return null;
   }
}
