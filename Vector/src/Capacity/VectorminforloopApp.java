package Capacity;
import java.util.*;
public class VectorminforloopApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            v.add(val);
        }    
        System.out.println("Vector Elements are:");
        for(i=0;i<limit;i++)
        {
            System.out.println(v.get(i));
        }
        int min =(int)v.get(0);
        for(i=0;i<limit;i++)
        {
            if((int)v.get(i)<min)
            {
                min = (int)v.get(i);
            }
        }
        System.out.println("Minimum Element in Vector is:" + min);
    }
}
