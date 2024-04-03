package Assignments;
import java.util.*;
public class MaxminvectorApp 
{
    public static void main(String[] args) 
    {
        Vector<Integer> v = new Vector<Integer>();
        Scanner xyz = new Scanner(System.in);
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be Added inside Vector:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            v.add(val);
        }    
        System.out.println("Display Data inside Vector:");
        for(Integer e : v)
        {
            System.out.println(e);
        }
        int max;
        max = v.get(0);
        for(Integer e : v)
        {
            if(e>max)
            {
                max = e;
            }
        }
        System.out.println("Maximum Element Inside Vector: " + max);
        int min;
        min = v.get(0);
        for(Integer e : v)
        {
            if(e<min)
            {
                min = e;
            }
        }
        System.out.println( "Minimum Element Inside Vector: "+ min);
    }
}
