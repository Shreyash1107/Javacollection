package Capacity;
import java.util.*;
public class VectorcollectionApp 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        Scanner xyz = new Scanner(System.in);
        int i,val;
        System.out.println("Enter the Elements inside ArrayList:");
        for(i=0;i<5;i++)
        {
            val = xyz.nextInt();
            al.add(val);
        }
        System.out.println("Elements inside ArrayList are:" + al);
        Vector v = new Vector(al);   //Adding or copying the Collection inside Vector
        int limit;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = xyz.nextInt();
        System.out.println("Enter the Elements inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            v.add(val);
        }
        System.out.println("Vector Elements are:" + v);
    }
}
