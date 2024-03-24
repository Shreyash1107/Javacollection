package Collection;
import java.util.*;
public class ObjectclassApp 
{
    public static void main(String[] args) 
    {
        Object obj[] = new Object[5];
        System.out.println("Enter the Data inside Object:");
        Scanner xyz = new Scanner(System.in);
        int i;
        for(i=0;i<obj.length;i++)
        {
           obj[i] = xyz.next(); //can read or accept any type of data as a String
        }
        System.out.println("Display Data:");
        for(i=0;i<obj.length;i++)
        {
            System.out.println(obj[i]);
        }
    }
}
