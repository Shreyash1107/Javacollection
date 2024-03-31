package Setcollection;
import java.util.*;
public class DuplicateremoveApp 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int limit,i,val;    
        System.out.println("Enter the Number of Elements to be added inside ArrayList:");
        limit = sc.nextInt();
        System.out.println("Enter the Elements inside ArrayList:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            al.add(val);
        }
        System.out.println("Display Data inside ArrayList:");  //Created ArrayList just to store Duplicate Elements
        for(Object obj:al)
        {
            System.out.println(obj);
        }
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.addAll(al);  //Copy the ArrayList Data inside Set so as to remove Duplicates as Set cannot have Duplicate Values 
        System.out.println("Display Data inside Set:");
        for(Object obj:lhs)
        {
            System.out.println(obj);
        }
    }
}
