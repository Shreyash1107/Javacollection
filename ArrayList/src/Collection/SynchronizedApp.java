package Collection;
import java.util.*;
public class SynchronizedApp 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        Scanner xyz = new Scanner(System.in);
        int limit,val,i;
        System.out.println("Enter the Number of Elements to be added inside ArrayList:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside ArrayList:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            al.add(val);
        }    
        System.out.println("Display Data inside ArrayList:");
        for(Object obj:al)
        {
            System.out.println(obj);
        }
        List list = Collections.synchronizedList(al);  //Converting non thread-safe to Thread safe Collection
        System.out.println("Display Data inside Collection after converting to thread-safe Collection:");
        System.out.println(list);
    }
}
