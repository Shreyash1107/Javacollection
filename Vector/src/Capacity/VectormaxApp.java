package Capacity;
import java.util.*;
public class VectormaxApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        int limit;
        System.out.println("Enter the Number of Elements to be inserted inside Vector:");
        limit = sc.nextInt();
        int i,val;
        System.out.println("Enter the Elements inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            v.add(val);
        }    
        System.out.println("Display Vector ELements:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        int max;
        max = (int)v.get(0);
        for(Object obj:v)
        {
            if((int)obj>max)
            {
                max = (int)obj;
            }
        }
        System.out.println("Maximum Element present inside Vector is:" + max);
    }
}
