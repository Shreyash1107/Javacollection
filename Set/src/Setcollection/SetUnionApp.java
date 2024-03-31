package Setcollection;
import java.util.*;
public class SetUnionApp 
{
    public static void main(String[] args) 
    {
        LinkedHashSet lhs = new LinkedHashSet(); 
        Scanner xyz = new Scanner(System.in);
        int limit,val,i;
        System.out.println("Enter the Number of Elements to be added inside 1st Set:");
        limit = xyz.nextInt(); 
        System.out.println("Enter the Data inside Set:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            lhs.add(val);
        }   
        LinkedHashSet Hs = new LinkedHashSet();
        System.out.println("Enter the Number of Elements to be Added inside 2nd Set:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside the 2nd Set:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            Hs.add(val);
        }
        LinkedHashSet union = new LinkedHashSet(lhs);
        union.addAll(Hs);
        System.out.println("Union of two sets is:");
        for(Object obj:union)
        {
            System.out.println(obj);
        }
    }
}
