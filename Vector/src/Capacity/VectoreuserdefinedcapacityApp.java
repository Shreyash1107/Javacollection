package Capacity;
import java.util.*;
public class VectoreuserdefinedcapacityApp 
{
    public static void main(String[] args) 
    {
        int initialcap;
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Initial Capacity of a Vector:");
        initialcap = xyz.nextInt();
        Vector v = new Vector(initialcap);
        System.out.println("Initial Capacity of Vector is:" +initialcap);
        int limit;
        System.out.println("Enter the Limit or Number of Elements to be added to the Vector:");
        limit = xyz.nextInt();
        System.out.println("Enter the Elements inside Vector:");
        int i,val;
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            v.add(val);
        }
        System.out.println("The Elements inside Vector are:" + v);
        int size = v.size();
        System.out.println("Size of the Vector is:" + size);
        int capacity = v.capacity();
        System.out.println("After Capacity Cross the Capacity of Vector is:" + capacity);
    }
}
