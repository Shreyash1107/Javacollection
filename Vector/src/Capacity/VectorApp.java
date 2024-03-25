package Capacity;
import java.util.*;
public class VectorApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner xyz = new Scanner(System.in);
        int limit;
        System.out.println("Enter the Number of Elements you want to Enter in the Vector:");
        limit = xyz.nextInt();
        int val,i;
        System.out.println("Enter the Data inside Vector:");
        for(i=0; i<limit; i++)
        {
            val = xyz.nextInt();
            v.add(val);
        }
        System.out.println("Vector Elements are:");
        // for(i=0;i<v.size();i++)
        // {
        //     Object obj = v.get(i);
        //     System.out.println(obj);
        // }
        for(Object obj:v)
        {
            System.out.println(obj);
        }
    }
}
