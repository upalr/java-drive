import java.util.ArrayList;
import java.io.*;
/**
 * This class is a utility class which defines methods for file reading and writing.
 * 
 * @author Shamara 
 * @version 1.0
 */
public class FileUtility
{
    /** saveData(String fileName, ArrayList<String> data) writes the list of Strings in data ArrayList 
     * to the file specified.
     * 
     * @param   fileName  The file name(may include tha path) to which data is written
     * @param   data  An array list of Strings which consists of object data to be saved
     * 
     */
    public static void saveData(String fileName, ArrayList<String> data) throws IOException
    {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName));
            for(String s : data)
            {
                pw.println(s);
            }
            pw.close();
    }
    
    /** readData(String fileName) reads object data from the file specified to an ArrayList of Strings.
     * 
     * @param   fileName  The file name(may include tha path) from which object data is read
     * @return  ArrayList<String>  An array list of Strings which consists of object data that is read from the file
     * 
     */
    public static ArrayList<String> readData(String fileName) throws IOException, FileNotFoundException
    {
        ArrayList<String> data = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        
        String temp = in.readLine(); 
        while (temp != null)
        {
            data.add(temp);
            temp = in.readLine();
        }
        in.close();
        return data;
    }
}
