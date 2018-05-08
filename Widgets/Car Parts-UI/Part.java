import java.util.ArrayList;
/**
 * This class represents a car part.
 * 
 * @author Shamara Gibson
 * @version 1.0
 */

public class Part 
{
    private String description;
    private String partNumber;
    private double cost;
    
    /**
     * Constructor for objects of class Part
     * 
     * @param data  comma delimited string with part no, desc and cost
     * 
     */
    public Part(String data)
    {
        
        String[] list = data.split(",");
        this.partNumber = list[0];
        this.description = list[1];
        // may throw excpetion must deal with this (need to learn more about exceptions)
        this.cost = Double.parseDouble(list[2]);    
    }
    
    /**
     * Constructor for objects of class Part
     * 
     * @param aDescription  a description of the car part
     * @param partCost  the cost of the car part
     * @param partNumber  the identification number of the car part
     * 
     */
    public Part(String aDescription, double partCost, String partNumber)
    {
        this.description = aDescription;
        this.cost = partCost;
        this.partNumber = partNumber;
    }
    
    /**
     * A mutator method to set the part number
     * 
     * @param partNumber  the identification number of the car part
     * 
     */
    public void setPartNumber(String aPartNumber)
    {
        this.partNumber = aPartNumber;
    }
    
    /**
     * An accessor method to return the part identification number
     * 
     * @return String an object containing the part number
     * 
     */
    public String getPartNumber()
    {
        return partNumber;
    }
    
    /**
     * A mutator method to set the part description
     * 
     * @param aDescp  a description for the car part
     * 
     */
    public void setDescription(String aDescp)
    {
        this.description = aDescp;
    }
    
    /**
     * An accessor method to return the part description
     * 
     * @return String a String object which contain the part description
     * 
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * A mutator method to set the part cost
     * 
     * @param aCost  the cost of car part
     * 
     */
    public void setCost(double aCost)
    {
        this.cost = aCost;
    }
    
    /**
     * An accessor method to return the part cost
     * 
     * @return double the cost of the car part
     * 
     */
    public double getCost()
    {
        return cost;
    }
    
    /**
     * A method to return a String representation of a car part object
     * 
     * @return String an object containing part details
     * 
     */
    public String toString()
    {
        return "Part : " + description +
        " No:" + partNumber + ", Cost: " + cost;
    }
    
    /**
     * A method to save current car part object to the arraylist
     * 
     * @param data An arraylist of String representations of part objects
     * 
     */
    public void savePart(ArrayList<String> data)
    {
        data.add(partNumber + "," + description + "," + cost);
    }
      
}
