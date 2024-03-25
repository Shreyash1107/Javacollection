package Capacity;
import java.util.*;
public class VectoriteratorApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        int i,limit,val;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            v.add(val);
        }
        Iterator iter = v.iterator();
        System.out.println("Data inside Vector is:");
        while(iter.hasNext())
        {
            Object obj = iter.next();
            System.out.println(obj);
        }
    }
}
