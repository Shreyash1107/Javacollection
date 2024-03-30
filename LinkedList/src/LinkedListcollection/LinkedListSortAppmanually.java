package LinkedListcollection;
import java.util.*;
public class LinkedListSortAppmanually 
{
    public static void main(String[] args) 
    {
        LinkedList lst = new LinkedList();
        Scanner xyz = new Scanner(System.in);
        int limit,val,j,i;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside LinkedList"); 
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            lst.add(val);
        }   
        System.out.println("Display Data inside LinkedList before Sorting:");
        for(Object obj:lst)
        {
            System.out.println(obj);
        }
        for(i=0;i<limit;i++)
        {
            for(j=(i+1);j<limit;j++)
            {
                Object prev = lst.get(i);
                Object next = lst.get(j);
                if((int)prev>(int)next)
                {
                    lst.set(i, next);
                    lst.set(j, prev);
                }
            }
        }
        System.out.println("Data Fter Sorting is:");
        for(Object obj : lst)
        {
            System.out.println(obj);
        }
    }
}
