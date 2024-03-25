package Capacity;
import java.util.Scanner;
import java.util.Vector;

public class VectorcrosscapacityApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();   
        int limit;
        Scanner xyz = new Scanner(System.in);
        int capacity = v.capacity();
        System.out.println("Initial Capacity of a Vector is:" + capacity);
        System.out.println("Enter the Limit for Vector Elements:");
        limit = xyz.nextInt();
        int i;
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            int val = xyz.nextInt();
            v.add(val);
        }
        System.out.println("Vector Elements are:" + v);
        System.out.println("Size of Vector is:" + v.size());
        System.out.println("After Capacity Cross, Vector Capacity is:" + v.capacity());
    }
}