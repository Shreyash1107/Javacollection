package LinkedListcollection;
import java.util.*;
public class LinkedListmaxApp 
{
    public static void main(String[] args) 
    {
        LinkedList lst = new LinkedList();
        Scanner xyz = new Scanner(System.in);
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be added inside LinkedList:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside LinkedList:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            lst.add(val);
        }    
        System.out.println("Display Data inside Linkedlist:");
        for(Object obj:lst)
        {
            System.out.println(obj);
        }
        int max;
       max = (int)Collections.max(lst);
        System.out.println("Maximum Element in LinkeKist is:" + max);
    }
}
