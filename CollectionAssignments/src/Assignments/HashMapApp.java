package Assignments;
import java.util.*;
public class HashMapApp 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<Integer,String>map = new LinkedHashMap<Integer,String>();
        Scanner xyz = new Scanner(System.in);
        Set<Map.Entry<Integer,String>> entry = map.entrySet();
        int limit,i,key;
        String value;
        System.out.println("Enter the Number of Elements to be added inside Map:");
        limit = xyz.nextInt();
        System.out.println("");
        for(i=0;i<limit;i++)
        {
            System.out.println("Enter the Key inside the map:");
            key = xyz.nextInt();
            xyz.nextLine();  //Consuming Newline Character
            System.out.println("Enter the Value Corresponding to that Map:");
            value = xyz.nextLine();
            map.put(key, value);
            System.out.println("");
        }
        System.out.println("Display Data insie HashMap:");
        for(Map.Entry<Integer,String> m : entry)
        {
            System.out.println(m.getKey() + "--->" + m.getValue());
        }
    }
}
