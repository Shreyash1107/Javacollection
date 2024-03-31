package Collections;

import java.util.Comparator;

public class Sortemployeebysal implements Comparator 
{
    public int compare(Object ob1,Object ob2)
    {
        Employee emp1 = (Employee)ob1;
        Employee emp2 = (Employee)ob2;
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
