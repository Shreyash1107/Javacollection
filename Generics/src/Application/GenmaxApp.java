package Application;
import java.util.*;
public class GenmaxApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vector<Integer>v = new Vector<>();
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit  = sc.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            v.add(val);
        }    
        System.out.println("Display Data inside Vector");
        for(Integer obj:v)
        {
            System.out.println(obj);
        }
        int max;
        max = (int)v.get(0);
        for(Integer obj:v)
        {
            if(obj>max)
            {
                max = obj;
            }
        }
        System.out.println("Maximum Element inside Vector is " + max);
    }
}
