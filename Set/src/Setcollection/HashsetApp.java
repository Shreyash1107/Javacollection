package Setcollection;
import java.util.*;
public class HashsetApp 
{
    public static void main(String[] args) 
    {
            HashSet hs = new HashSet();
            Scanner sc = new Scanner(System.in);
            int limit,i,val;
            System.out.println("Enter the Number of Elements to be added inside HashSet:");
            limit = sc.nextInt();
            System.out.println("Enter the Data inside Set:");
            for(i=0;i<limit;i++)
            {
                val = sc.nextInt();
                hs.add(val);
            }
            // hs.add(100);
            // hs.add(333);
            // hs.add(5);
            // hs.add(200);
            System.out.println("Display Data inside Hashset:");
            for(Object obj:hs)
            {
                System.out.println(obj);
            }
    }
}
