package Assignments;
import java.util.*;
public class ArrOccurrenceApp 
{
    public static void main(String[] args) 
    {
        int a[],i;
        a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements inside Array:");
        for(i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
            // System.out.println("");
        }    
        System.out.println("Display Data inside Array:");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
            System.out.println("");
        }
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        Set<Map.Entry<Integer,Integer>> entry = map.entrySet();
        for(int val : a)
        {
            if(map.containsKey(val))
            {
                map.put(val, map.get(val)+1);
            }
            else
            {
                map.put(val, 1);
            }
        }
        System.out.println("Display the Occurrence of Every value Present Inside the Array:");
        for(Map.Entry<Integer,Integer> m1 : entry)
        {
            System.out.println(m1.getKey() + "---->" + m1.getValue());
        }
    }
}
