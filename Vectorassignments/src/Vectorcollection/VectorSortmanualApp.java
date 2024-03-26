package Vectorcollection;
import java.util.*;
public class VectorSortmanualApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        int limit,i,j,val;
        System.out.println("Enter the Number of Elements to be Added inside Vector:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            v.add(val);
        }  
        System.out.println("Display Data inside Vector:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }  
        for(i=0;i<limit;i++)
        {
            for(j=i+1;j<limit;j++)
            {
                Object prev = v.get(i);
                Object next = v.get(j);
                if((int)prev>(int)next)
                {
                    v.set(i,next);
                    v.set(j, prev);
                }
            }
        }
        System.out.println("After Sorting Vector is:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
    }
}
