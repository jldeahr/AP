public class Trio implements MenuItem
{
    Sandwich sandwich;
    Salad salad;
    Drink drink;
    
    public Trio(Sandwich san, Salad sal, Drink dri)
    {
        sandwich = san;
        salad = sal;
        drink = dri;
    }
    
    public static void main (String[] args)
    {
        Trio trio = new Trio(sandwich, salad, drink);
        
        Trio trio1 = new Trio(salad, sandwich, drink);
        Trio trio2 = new Trio(sandwich, salad, salad);
    }
}
