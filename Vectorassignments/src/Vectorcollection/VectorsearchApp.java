package Vectorcollection;
import java.util.*;
public class VectorsearchApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner xyz = new Scanner(System.in);
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            v.add(val);
        }  
        System.out.println("Display Vector Elements:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        int skey;
        System.out.println("Enter the Element which you wants to search:");
        skey = xyz.nextInt();
        boolean b = v.contains(skey);
        if(b)
        {
            System.out.println(skey + " is present in Vector");
        }
        else
        {
            System.out.println(skey + " is not present inside Vector");
        }
    }
}
