package Capacity;
import java.util.*;
public class VectorincreamentalcapacityApp 
{
    public static void main(String[] args) 
    {
        int increamentalcap,initialcap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Initial Capacity of the Vector:");
        initialcap = sc.nextInt();
        System.out.println("Enter the Increamental Capacity of the Vector:");
        increamentalcap = sc.nextInt();
        Vector v = new Vector(initialcap,increamentalcap);
        System.out.println("Initial Capacity of the Vector is:" + initialcap);
        int lim;
        System.out.println("Enter the Limit or Number of Elements to be added inside Vector:");
        lim = sc.nextInt();
        int i;
        System.out.println("Enter the Elements inside Vector:");
        for(i=0;i<lim;i++)
        {
            int val;
            val = sc.nextInt();
            v.add(val);
        }
        System.out.println("The Elements inside Vector are:" + v);
        int size = v.size();
        System.out.println("Size of the Vector is:" + size);
        int capacity = v.capacity();
        System.out.println("After Capacity Cross, Capacity of Vector is:" + capacity);
    }
}