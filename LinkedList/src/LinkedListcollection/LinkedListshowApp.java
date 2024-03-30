package LinkedListcollection;
import java.util.*;
public class LinkedListshowApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        LinkedList lst = new LinkedList();   
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be added inside LinkedList:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside Linkedlist:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            lst.add(val);
        }
        System.out.println("Display Data inside LinkedList:");
        for(Object obj:lst)
        {
            System.out.println(obj);
        }
    }
}
