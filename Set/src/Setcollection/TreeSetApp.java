package Setcollection;
import java.util.*;
public class TreeSetApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        TreeSet ts = new TreeSet();
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be added to the TreeSet:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside TreeSet:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            ts.add(val);
        }    
        System.out.println("Display Data inside TreeSet:");
        for(Object obj:ts)
        {
            System.out.println(obj);
        }
    }
}
