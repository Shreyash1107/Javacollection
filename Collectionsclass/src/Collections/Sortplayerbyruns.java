package Collections;

import java.util.Comparator;

public class Sortplayerbyruns implements Comparator 
{
    public int compare(Object ob1,Object ob2)
    {
        Player p1 = (Player)ob1;
        Player p2 = (Player)ob2;
        if(p1.getruns()>p2.getruns())
        {
            return 1;
        }
        else if(p1.getruns()<p2.getruns())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
