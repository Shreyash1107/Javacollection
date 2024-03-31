package Collections;

import java.util.Comparator;

public class SortPlayerbyId implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Player p1 = (Player)obj1;
        Player p2 = (Player)obj2;
        if(p1.getid()>p2.getid())
        {
            return 1;
        }
        else if(p1.getid()<p2.getid())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
