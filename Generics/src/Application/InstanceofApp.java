package Application;
import java.util.*;

public class InstanceofApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList();
        int limit,i;
        int val;
        System.out.println("Enter the Number of elements to be added inside ArrayList:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside ArrayList:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            al.add(val);
        }
        System.out.println("Display Data inside ArrayList:");
        for(Object obj:al)   
        {
            System.out.println(obj);
        }
        // al.add(100);
        // al.add("Good");
        // al.add(5.4f);
        // al.add(new java.util.Date());
        // al.add(50);
        int sum = 0;
        for(Integer obj:al)
        {
           if(obj instanceof Integer)
           {
                sum = sum + (int)obj;
           }
        }
        System.out.println("Sum of all Values inside ArrayList is:" +sum);
    }
}
