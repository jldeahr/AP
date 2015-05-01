

/**
 * Write a description of class StudentAdvance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentAdvance
{
    double et = 20;
    double lt = 15;
    int d;
    int serialNumber = getNextSerialNumber();
    public StudentAdvance(int numDays)
    {
        d = numDays;
    }
    
    public String toString()
    /**
     * @pre ticket has studentID
     */
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }
    
    
}
