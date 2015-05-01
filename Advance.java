public class Advance extends Ticket
{
    double lt = 30;
    double et = 40;
    int d;
    public Advance(int numDays)
    {
        d = numDays;
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
