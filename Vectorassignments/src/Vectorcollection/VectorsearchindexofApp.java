package Vectorcollection;
import java.util.*;
public class VectorsearchindexofApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        int limit,val,i;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            v.add(val);
        }
        System.out.println("Display Vector Elements:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        int skey;
        System.out.println("Enter the Value you wants to search for:");
        skey = sc.nextInt();
        int index;
        index = v.indexOf(skey);
        if(index!=-1)
        {
            System.out.println(skey + " is Present in Vector");
        }
        else
        {
            System.out.println(skey + " is not Present inside Vector");
        }
    }
}
