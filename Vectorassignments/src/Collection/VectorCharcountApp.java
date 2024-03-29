package Collection;

import java.util.*;

public class VectorCharcountApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        int i,limit;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = sc.nextInt();
        String str;
        sc.nextLine(); //Consuming newline Character
        System.out.println("Enter the Data inside Vector");
        for(i=0;i<limit;i++)
        {
            str = sc.nextLine();
            v.add(str);
        }
        System.out.println("Display Vector Data:");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        System.out.println("Count of Word present on every Index is:");
        for(i=0;i<limit;i++)
        {
            str = (String)v.get(i);
            String words[] = str.split("  ");
            int count = words.length;
            System.out.println(i + "  " + count);
        }
    }
}
