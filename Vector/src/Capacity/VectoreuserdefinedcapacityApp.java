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
        Vector v = new Vector(initialcap);//3
        System.out.println("Initial Capacity of Vector is:" +initialcap);
        v.add(10);
        v.add(20);
        v.add(300);
        v.add(600);
        v.add(900);
        v.add(800);
        v.add(700);
        v.add(500);
        v.add(800);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        // v.add(70);
        // v.add(80);
        // v.add(90);
        System.out.println("Capacity After Cross is "+v.capacity());
        // System.out.println("Capacity "+v.capacity());
        // int limit;
        // System.out.println("Enter the Limit or Number of Elements to be added to the Vector:");
        // limit = xyz.nextInt();//10
        // System.out.println("Enter the Elements inside Vector:");
        // int i,val;
        // for(i=0;i<limit;i++)
        // {
        //     val = xyz.nextInt();
        //     v.add(val);

        // }
        // System.out.println("The Elements inside Vector are:" + v);
        // int size = v.size();
        // System.out.println("Size of the Vector is:" + size);
        // int capacity = v.capacity();
        // System.out.println("After Capacity Cross the Capacity of Vector is:" + capacity);
    }
}
