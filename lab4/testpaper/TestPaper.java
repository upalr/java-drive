import java.util.*;

/**
 * TestPaper class for modeling real TestPaper.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class TestPaper
{
   // instance variables - id, testDate, mark and mcqList represent id, test date, mark and list of mcq of each test paper respectively
   private int id;
   private Date testDate; 
   private int mark;
   private ArrayList<MCQ> mcqList;
    
   /**
    * Changes the id of this TestPaper
    * 
    * @param id This TestPaper's new id 
    */
   public void setId(int id) {
      this.id = id;
   }

   /**
    * Gets the id of this TestPaper
    * 
    * @return this TestPaper's id
    */
   public int getId() {
      return id;
   }
   
   /**
    * Changes the testDate of this TestPaper
    * 
    * @param testDate This TestPaper's new testDate 
    */
   public void setTestDate(Date testDate) {
      this.testDate = testDate;
   }

   /**
    * Gets the testDate of this TestPaper
    * 
    * @return this TestPaper's testDate
    */ 
   public Date getTestDate() {
      return testDate;
   }
    
   /**
    * Changes the mark of this TestPaper
    * 
    * @param mark This TestPaper's new mark 
    */
   public void setMark(int mark) {
      this.mark = mark;
   }

   /**
    * Gets the mark of this TestPaper
    * 
    * @return this TestPaper's mark
    */  
   public int getMark() {
      return mark;
   }
    
   /**
    * Constructor for objects of class TestPaper
    */
   public TestPaper(int id, Date testDate, int mark)
   {
       // initialise instance variables - id, testDate, mark and mcqList
       this.id = id;
       this.testDate = testDate;
       this.mark = mark;
       mcqList = new ArrayList<MCQ>();
   }
    
   /**
    * Add MCQs to TestPaper's list 
    *
    * @param  newMCQ  first paramter of addMCQ method. Represents new MCQ object 
    */
   public void addMCQ(MCQ newMCQ){
       mcqList.add(newMCQ);
   }
   
   /**
    * Remove a mcq from TestPaper's list 
    *
    * @param  mcqId  first paramter of removeMCQ method. Represents mcq's id
    * @return  boolean  if mcq successfully removerd then return true . Otherwise return false
    */
   public boolean removeMCQ(int mcqId){
      MCQ foundMCQ = findMCQ(mcqId); 
      if(foundMCQ != null){
          mcqList.remove(foundMCQ);
          return true;
      }
      else {
          return false;
      }
   }
   
   /**
    * Find a MCQ from TestPaper's list 
    *
    * @param  mcqId  first paramter of findMCQ method. Represents mcq's id
    * @return  mcq  return the mcq if matches with the mcqid. Otherwise return null
    */
   public MCQ findMCQ(int mcqId){
      for(MCQ mcq : mcqList) {
          if(mcq.getId() == mcqId){
              return mcq;
          }
      }
      return null;
   }
   
   /**
    * Provide all MCQs from TestPaper's list 
    *
    * @return  mcqList  return all the mcqs associated with the TestPaper
    */
   public ArrayList<MCQ> getAllMCQs(){
       return mcqList;
   }
}
