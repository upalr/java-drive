
/**
 * Choice class for modeling choice of MCQ questions.
 *
 * @author Upal Roy
 * @version 1.0.0s
 */
public class Choice
{
   // instance variables - id, description, questionId and isCorrectAns represent id, description, question id and is Correct Answer of each Choice respectively
   private int id;
   private String description;
   private int questionId;
   private boolean isCorrectAns;
   
   /**
    * Changes the id of this Choice
    * 
    * @param id This Choice's new id 
    */
   public void setId(int id) {
      this.id = id;
   }
   
   /**
    * Gets the id of this Choice
    * 
    * @return this Choice's id
    */
   public int getId() {
      return id;
   }
   
   /**
    * Changes the description of this Choice
    * 
    * @param description This Choice's new description 
    */
   public void setDescription(String description) {
      this.description = description;
   }
   
   /**
    * Gets the description of this Choice
    * 
    * @return this Choice's description
    */
   public String getDescription() {
      return description;
   }
   
   /**
    * Changes the questionId of this Choice
    * 
    * @param questionId This Choice's new questionId 
    */
   public void setQuestionId(int questionId) {
      this.questionId = questionId;
   }
   
   /**
    * Gets the questionId of this Choice
    * 
    * @return this Choice's questionId
    */
   public int getQuestionId() {
      return questionId;
   }
   
   /**
    * Changes the isCorrectAns of this Choice
    * 
    * @param isCorrectAns This Choice's new isCorrectAns 
    */
   public void setCorrectAns(boolean isCorrectAns) {
      this.isCorrectAns = isCorrectAns;
   }
   
   /**
    * Gets the isCorrectAns of this Choice
    * 
    * @return this Choice's isCorrectAns
    */
   public boolean getCorrectAns() {
      return isCorrectAns;
   }
   

    /**
     * Constructor for objects of class Choice
     */
    public Choice(int id, String description, int questionId, boolean isCorrectAns)
    {
        // initialise instance variables - id, description, questionId and isCorrectAns
        this.id = id;
        this.description = description;
        this.questionId = questionId;
        this.isCorrectAns = isCorrectAns;
    }
}
