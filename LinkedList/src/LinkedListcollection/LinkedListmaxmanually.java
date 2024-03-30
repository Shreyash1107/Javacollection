package LinkedListcollection;
import java.util.*;
public class LinkedListmaxmanually 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        LinkedList lst = new LinkedList();    
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be added inside LinkedList:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside LinkedList:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            lst.add(val);
        }
        System.out.println("Dispaly Data inside LinkedList:");
        for(Object obj:lst)
        {
            System.out.println(obj);
        }
        int max;
        max = (int)lst.get(0);
        for(Object obj:lst)
        {
            if((int)obj>max)
            {
                max = (int)obj;
            }
        }
        System.out.println("Maximum Element inside LinkedList is:" +max);
    }
}
