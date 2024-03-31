package Setcollection;
import java.util.*;
public class SetdifferenceApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet set1 = new LinkedHashSet();
        int limit,val,i;
        System.out.println("Enter the Number of Elements to be added inside 1st LinkedHashSet:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside the 1st LinkedHashSet:"); 
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            set1.add(val);
        }   
        System.out.println("Display Data of First LinkedHashSet:");
        for(Object obj:set1)
        {
            System.out.println(obj);
        }
        LinkedHashSet set2 = new LinkedHashSet();
        System.out.println("Enter the Number of Elements to be added inside the second LinkedHashSet:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside 2nd LinkedHashSet:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            set2.add(val);
        }
        System.out.println("Display Data inside 2nd LinkedHashSet:");
        for(Object obj:set2)
        {
            System.out.println(obj);
        }
        LinkedHashSet diff = new LinkedHashSet(set1);
        diff.removeAll(set2);
        System.out.println("Difference between 2 Sets is:");
        for(Object obj:diff)
        {
            System.out.println(obj);
        }
    }
}