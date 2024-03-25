package Capacity;
import java.util.*;
public class VectorsumApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner xyz = new Scanner(System.in);
        int limit;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = xyz.nextInt();
        System.out.println("Enter the Elements in the Vector:");    
        int i,val;
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            v.add(val);
        }
        System.out.println("Vector Elements are:" + v);
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        int sum;
        sum = 0;
        for(Object obj:v)
        {
            sum = sum + (int)obj;
        }
        System.out.println("Sum of Elements inside Vector are:" + sum);
    }
}
