package Vectorcollection;
import java.util.*;
public class VectorsumApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        int limit,i;
        System.out.println("Enter the number of Elements to be added inside Vector:");
        limit = sc.nextInt();
        float val;
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextFloat();
            v.add(val);
        }    
        System.out.println("Display Data inside Vector:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        float sum = 0;
        for(Object obj:v)
        {
            sum  = sum + (float)obj;
        } 
        System.out.println("Sum of All Elements inside Vector is:" +sum);
    }
}
