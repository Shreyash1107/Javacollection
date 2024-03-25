package Capacity;
import java.util.*;
public class VectorEnumerationApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        int limit;
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside Vector:");
        int i,val;
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            v.add(val);
        }
        System.out.println("Data Present inside Vector is:");
        Enumeration enm = v.elements();
        while(enm.hasMoreElements())
        {
            Object obj = enm.nextElement();
            System.out.println(obj);
        }
    }
}
