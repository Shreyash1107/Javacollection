package Collections;

import java.util.Comparator;

public class Sortemployeebyid implements Comparator 
{
    @Override
    public int compare(Object obj1, Object obj2)
    {
        Employee emp1 = (Employee)obj1;
        Employee emp2 = (Employee)obj2;
        if(emp1.getid()>emp2.getid())
        {
            return 1;
        }
        else if(emp1.getid()<emp2.getid())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
