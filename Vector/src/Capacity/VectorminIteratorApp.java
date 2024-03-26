package Capacity;
import java.util.*;
public class VectorminIteratorApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner xyz = new Scanner(System.in);
        int limit,val,i;
        System.out.println("Enter the Number of Elements to be added inside the Vector:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside Vector:");
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
        int min = (int)v.get(0);
        for(Object obj:v)
        {
            if((int)obj<min)
            {
                min = (int)obj;
            }
        }
        System.out.println("Minimum Element in Vector is:" + min);
    }
}
