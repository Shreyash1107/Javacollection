package Stackmethods;
import java.util.*;
public class StackcollectionApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        Stack s = new Stack();
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be added into the Stack:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside the Stack:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            // s.add(val);
            s.push(val);
        }    
        System.out.println("Display Stack Elements:");
        for(Object obj:s)
        {
            System.out.println(obj);
        }
    }
}
