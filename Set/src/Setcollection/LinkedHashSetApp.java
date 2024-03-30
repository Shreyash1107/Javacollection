package Setcollection;
import java.util.*;
public class LinkedHashSetApp 
{
    public static void main(String[] args) 
    {
        LinkedHashSet ls = new LinkedHashSet();
        Scanner xyz = new Scanner(System.in);
        int limit,value,i;
        System.out.println("Enter the Number of Elements to be Added inside Set:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside Set:");
        for(i=0;i<limit;i++)
        {
            value = xyz.nextInt();
            ls.add(value);
        }    
        System.out.println("Display Data inside LinkedHashSet:");
        for(Object obj:ls)
        {
            System.out.println(obj);
        }
    }
}
