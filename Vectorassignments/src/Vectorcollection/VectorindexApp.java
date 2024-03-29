package Vectorcollection;
import java.util.*;
public class VectorindexApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        int limit,value,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            value = sc.nextInt();
            v.add(value);
        }    
        System.out.println("Display Data inside Vector:");
        for(i=0;i<5;i++)
        {
            System.out.println(i + "   " + v.get(i));
        } 
    }
}
