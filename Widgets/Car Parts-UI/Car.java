import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * This class represents a car which consists of several parts.
 * 
 * @author Shamara Gibson
 * @version 1.0
 */

public class Car
{
    private ArrayList<Part> partsList;
    
    /**
     * Constructor for objects of class Car which reads and constructs part objects from file
     * 
     */
    public Car()
    {
        try
        {
            partsList = new ArrayList<Part>(); 
            getPartsFromFile();
        }
        catch(Exception ex) //A better approach is to have seperate handlers to handle specific exceptions
        {
            System.out.println(ex);
        }    
    }
    
    /**
     * A method to add a Part object to the list of parts
     * 
     * @param aPart  a part object
     * 
     */
    public void addPart(Part aPart)
    {
        partsList.add(aPart);
    }
    
    /**
     * A method to get a Part object from the list of parts given the index in the list
     * 
     * @param index  index number of the part object in the partsList
     * 
     */
    public Part getPart(int index)
    {
        // this is not safe ***********************************
        return partsList.get(index);
    }

    /**
     * A method to get all Part objects in the partsList
     * 
     * @return ArrayList<Part>  an ArrayList of part objects
     * 
     */
    public ArrayList<Part> getAllParts()
    {
        return partsList;
    }

    /**
     * A method to find and return all Part objects in the partsList that matches a specific criteria
     * 
     * @param criteria  a String object containing the search criteria
     * @return ArrayList<Part>  an ArrayList of part objects that matches the critera
     * 
     */
    public ArrayList<Part> findMatchingParts(String criteria)
    {
        ArrayList<Part> found = new ArrayList<Part>();
        for(Part p : partsList)
        {
            if(p.getDescription().contains(criteria))
            found.add(p);
        }
        
        return found;
    }

    /**
     * A method to remove a Part object at the specified index
     * 
     * @param index  the position of the object to be removed in the partList
     * 
     */
    public void deletePart(int index)
    {
        // not safe
        partsList.remove(index);
    }

    /**
     * A method to remove a Part object that is given
     * 
     * @param partToRemove  the part object that needs to be removed from the partsList
     * 
     */
    public void removePart(Part partToRemove)
    {
        partsList.remove(partToRemove);
    }

    /**
     * A method to return the number of part objects in the partsList
     * 
     * @return int the number of part objects in the list
     * 
     */
    public int numberOfParts()
    {
        return partsList.size();
    }

    /**
     * A method to find a specific Part object given the part number
     * 
     * @param number  the identification number of the part to be removed
     * @return a part object that matches the identification number or null
     * 
     */
    public Part findPart(String number)
    {
        for(Part p : partsList)
        {
            if(p.getPartNumber().equals(number))
            return p;
        }
    
        return null;
    }    

    /**
     * An method to return a String representation of a car object
     * 
     * @return String an object containing car details
     * 
     */
    public String toString()
    {
        return "This is a Car. It has "+ partsList.size()+" parts";
    }

    /**
     * A method to collect car parts data as Strings and save to a file.
     */
    public void saveCar() throws IOException
    {
        ArrayList<String> dataList = new ArrayList<String>();
    
        for(Part p : partsList)
        {
            p.savePart(dataList);
        }
       
        FileUtility.saveData("CarData.txt",dataList);
    }

    /**
     * A method to read part data from file and construct part objects.
     */
    public void getPartsFromFile()throws IOException, FileNotFoundException
    {
        ArrayList<String> data = FileUtility.readData("CarData.txt");
    
        for(String s : data)
        {
            partsList.add(new Part(s));
        }  
    }

}  // end of car class

