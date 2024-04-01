package Application;
import java.util.*;
public class GenSortApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        LinkedList<Integer>lst = new LinkedList<>();
        int limit,i,j,val;
        System.out.println("Enter the Number of ELements to be added inside LinkedList:");
        limit =     xyz.nextInt();
        System.out.println("Enter the Data inside the LinkedList:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            lst.add(val);
        }
        System.out.println("Display Data inside LinkedList before Sorting:");
        for(Integer ob:lst)
        {
            System.out.println(ob);
        }
        for(i=0;i<limit;i++)
        {
            for(j=(i+1);j<limit;j++)
            {
                Integer prev = lst.get(i);
                Integer next = lst.get(j);
                if(prev>next)
                {
                    lst.set(i, next);
                    lst.set(j, prev);
                }
            }
        }
        System.out.println("Display Data After Sorting: ");
        for(Integer ob:lst)
        {
            System.out.println(ob);
        }
    }
}
