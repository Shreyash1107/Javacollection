package Vectorcollection;
import java.util.*;
public class VectorStringcountApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        int count,limit,i;
        System.out.println("Enter the Number of Elements to be added");
        limit = sc.nextInt();
        String str;
        sc.nextLine();   //Consuming newline character
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            str = sc.nextLine();
            v.add(str);
        }
        System.out.println("Data inside Vector is:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        /*System.out.println("Fecth Data Through Index:");
        for(i=0;i<limit;i++)
        {
            str = (String)v.get(i);
            System.out.println(str);
        }*/
        System.out.println("Count of Each Character is:");
        for(i=0;i<limit;i++)
        {
            str = (String)v.get(i);
            count = str.length();
            System.out.println(i + "  " + count);
        }
    }
}
