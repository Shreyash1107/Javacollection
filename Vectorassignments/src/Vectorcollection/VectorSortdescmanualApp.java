package Vectorcollection;
import java.util.*;
public class VectorSortdescmanualApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        Vector v = new Vector();
        int i,j,val,limit;
        System.out.println("Enter the Number of Elements you want to add inside Vector:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            v.add(val);
        }
        System.out.println("Display Data inside Vector Before Sorting:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        for(i=0;i<limit;i++)
        {
            for(j=i+1;j<limit;j++)
            {
                Object next = v.get(j);
                Object prev = v.get(i);
                if((int)next>(int)prev)
                {
                    v.set(i,next);
                    v.set(j, prev);
                }
            }
        }
        System.out.println("Data Inside Vector AFter Sorting is:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
    }
}
