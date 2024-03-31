package Setcollection;
import java.util.*;
public class TreesetdescApp 
{
    public static void main(String[] args) 
    {
        TreeSet ts = new TreeSet();
        Scanner sc = new Scanner(System.in);
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be Added inside the TreeSet:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside TreeSet:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            ts.add(val);
        }   
        System.out.println("Display Data inside TreeSet before Sorting:");
        for(Object obj:ts)
        {
            System.out.println(obj);
        }
        NavigableSet nav = ts.descendingSet();
        System.out.println("Display TreeSet Data after Sorting:");
        Iterator iter = nav.iterator();
        while(iter.hasNext())
        {
            Object obj = iter.next();
            System.out.println(obj);
        }
    }
}
