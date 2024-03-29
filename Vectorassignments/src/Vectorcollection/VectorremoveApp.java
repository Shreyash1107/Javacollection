package Vectorcollection;
import java.util.*;
public class VectorremoveApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        int limit,value,i;
        System.out.println("Enter the number of Elements to be added:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            value = sc.nextInt();
            v.add(value);
        }    
        System.out.println("Display Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            System.out.println(i + "   " + v.get(i));
        }
        int index;
        System.out.println("Enter the Index which you want to remove:");
        index = sc.nextInt();
        boolean b = (boolean) v.remove(index);
        if(b)
        {
            System.out.println("Value Deleted Successfully");
        }
        else
        {
            System.out.println("Value not deleted as Index not found");
        }
        System.out.println("Display Data inside Vector:");
       for(Object object : v)
       {
            System.out.println(object);
       }
    }
}
