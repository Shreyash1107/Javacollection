package Assignments;
import java.util.*;
public class ArrayListOccurrenceApp 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int limit,i,val;
        System.out.println("Enter the Number of Elements to be added inside ArrayList:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside ArrayList:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            al.add(val);
        }    
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Set <Map.Entry<Integer,Integer>> set1 = map.entrySet();
        for(int value:al)
        {
            if(map.containsKey(value))
            {
                map.put(value, map.get(value)+1);
            }
            else
            {
                map.put(value, 1);
            }
        }
        System.out.println("Display Occurence of Every Element in ArrayList:");
        for(Map.Entry m : set1)
        {
            System.out.println(m.getKey() + "---->" + m.getValue());
        }
    }
}
