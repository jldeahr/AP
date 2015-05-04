
/**
 * Write a description of class StudentAdvance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentAdvance extends Ticket
{
    double et = 20;
    double lt = 15;
    int d;
    int serialNumber = 0;// getNextSerialNumber();
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

    public double getPrice()
    {
        if (d >= 10)
        {
            return lt;
        }
        else
        {
            return et;
        }
    }
}
