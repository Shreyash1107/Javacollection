package Assignments;
import java.util.*;
public class VectorcharlengthApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        Vector<String>v = new Vector<String>();
        int limit,i;
        String val;
        System.out.println("Enter the Number of Elements to be added inside String:");
        limit = xyz.nextInt();
        xyz.nextLine();   //Consuming NewLine Character
        System.out.println("Enter the Elements inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextLine();
            v.add(val);
        }
        System.out.println("Display Data inside Vector:");
        for(String str:v)
        {
            System.out.println(str);
        }
        for(i=0;i<limit;i++)
        {
            System.out.println(i + "---->" + v.size());
        }
    }
}
