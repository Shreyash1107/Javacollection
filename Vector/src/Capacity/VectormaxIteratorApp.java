package Capacity;
import java.util.*;
public class VectormaxIteratorApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner xyz = new Scanner(System.in);
        int limit;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = xyz.nextInt();
        System.out.println("Enter the Elements inside Vector:"); 
        int i,val;
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            v.add(val);
        } 
        System.out.println("Display Vector Elements:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        int max;
        max = (int)v.get(0);
        Iterator iter = v.iterator();
        while(iter.hasNext())
        {
            Object obj = iter.next();
            if((int)obj>max)
            {
                max = (int)obj;
            }
        }
        System.out.println("Maximum ELement in Vector is:" +max);
    }
}
