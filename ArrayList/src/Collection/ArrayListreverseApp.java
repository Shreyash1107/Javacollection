package Collection;
import java.util.*;
public class ArrayListreverseApp 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        Scanner xyz = new Scanner(System.in);
        int limit,val,i;
        System.out.println("Enter the Number of Elements you want to be added inside ArrayList:");
        limit = xyz.nextInt();
        System.out.println("Enter the Elements inside ArrayList:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            al.add(val);
        }
        System.out.println("Display Data inside ArrayList before Reverse:");
        for(Object obj:al)
        {
            System.out.println(obj);
        }
        System.out.println("ArrayList After Reverse:");
        Collections.reverse(al);
        for(Object obj:al)
        {
            System.out.println(obj);
        }
    }
}
