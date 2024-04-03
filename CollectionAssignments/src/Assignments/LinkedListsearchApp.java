package Assignments;
import java.util.*;
public class LinkedListsearchApp 
{
    public static void main(String[] args) 
    {
            LinkedList<Integer> list = new LinkedList<Integer>();
            Scanner xyz = new Scanner(System.in);
            int limit,i,val;
            System.out.println("Enter the Number of Elements to be added inside LinkedList:");
            limit = xyz.nextInt();
            System.out.println("Enter the Data inside LinkedList:");
            for(i=0;i<limit;i++)
            {
                val = xyz.nextInt();
                list.add(val);
            }
            System.out.println("Display Data inside LinkedList:");
            for(Integer obj : list)
            {
                System.out.println(obj);
            }
            int skey,flag=-1;
            System.out.println("Enter the Search Key you want to Search for:");
            skey = xyz.nextInt();
            // boolean b = list.contains(skey);
            // if(b)
            // {
            //     System.out.println(skey + " is Present inside LinkedList");
            // }
            // else
            // {
            //     System.out.println(skey + " is not present inside LinkedList");
            // }
            for(i=0;i<limit;i++)
            {
                if(skey==list.get(i))
                {
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println(skey + " is present inside the list");
            }
            else
            {
                System.out.println(skey + " is not present inside the list");
            }
    }
}
