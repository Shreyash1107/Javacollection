package Vectorcollection;
import java.util.*;
public class VectorsecmaxApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        int i,val,limit;
        System.out.println("Enter the Number of Elements to be entered in Vector:");
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
        int max = 0;
        int secmax = (int)v.get(0);
        for(Object obj:v)
        {
            if((int)obj>max)
            {
                secmax = max;
                max = (int)obj;
            }
            else if((int)obj>secmax && (int)obj<max)
            {
                secmax = (int)obj;
            }
        }
        System.out.println("Second Max Element in Vector is:" +secmax);
    }
}
