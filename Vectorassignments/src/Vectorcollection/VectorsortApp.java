package Vectorcollection;
import java.util.*;
public class VectorsortApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        int limit,val,i;
        System.out.println("Enter the Number of Elements to be Added inside Vector:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            v.add(val);
        }    
        System.out.println("Display Vector Data:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        Collections.sort(v);
        System.out.println("Sorted Vector Collection is:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
    }
}
