package LinkedListcollection;
import java.util.*;
public class LinkedListsortApp 
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        Scanner xyz = new Scanner(System.in);
        int limit,i,j,val;
        System.out.println("Enter the Number of Elements to be added:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside LinkedList:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            list.add(val);
        }
        System.out.println("Display Data before Sorting:");
        for(Object obj:list)
        {
            System.out.println(obj);
        }
        Collections.sort(list);
        System.out.println("LinkedList After Sorting is:");
        for(Object obj:list)
        {
            System.out.println(obj);
        }
    }
}
