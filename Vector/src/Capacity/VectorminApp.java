package Capacity;
import java.util.*;
public class VectorminApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        int limit,val,i;
        System.out.println("Enter the Number of Elements to be added:");
        limit = sc.nextInt();
        System.out.println("Enter the Elements inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
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
