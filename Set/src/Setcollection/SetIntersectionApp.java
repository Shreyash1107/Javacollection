package Setcollection;
import java.util.*;
public class SetIntersectionApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        LinkedHashSet set1 = new LinkedHashSet();
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be added inside 1st Set:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside 1st Set");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            set1.add(val);
        }
        System.out.println("Display Data inside 1st Set:");
        for(Object obj:set1)
        {
            System.out.println(obj);
        }
        LinkedHashSet set2 = new LinkedHashSet();
        System.out.println("Enter the Number of Elements to be Added inside 2nd HashSet:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside the 2nd HashSet:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            set2.add(val);
        }
        LinkedHashSet intersection = new LinkedHashSet(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of 2 sets is:");
        for(Object obj: intersection)
        {
            System.out.println(obj);
        } 
    }
}
