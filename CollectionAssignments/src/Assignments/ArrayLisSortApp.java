package Assignments;
import java.util.*;
public class ArrayLisSortApp 
{
    public static void main(String[] args) 
    {
        ArrayList <Integer> al = new ArrayList<Integer>();
        Scanner xyz = new Scanner(System.in);
        int limit,val,i,j;
        System.out.println("Enter the Number of Ements to be Added inside ArrayList:");
        limit = xyz.nextInt();
        System.out.println("Enter the Data inside ArrayList:");
        for(i=0;i<limit;i++)
        {
            val = xyz.nextInt();
            al.add(val);
        }    
        System.out.println("Display Data inside ArrayList before Sorting:");
        for(Integer value : al)
        {
            System.out.println(value+" ");
        }
        for(i=0;i<limit;i++)
        {
            for(j=(i+1);j<limit;j++)
            {
                Integer prev = al.get(i);
                Integer next = al.get(j);
                if(prev>next)
                {
                    al.set(i, next);
                    al.set(j, prev);
                }
            }
        }
        System.out.println("Display Data Inside ArrayList After Sorting:");
        for(Integer value: al)
        {
            System.out.println(value);
        }
    }
}
