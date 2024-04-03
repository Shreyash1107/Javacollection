package MapImplementations;
import java.util.*;
public class HashMapApp 
{
    public static void main(String[] args) 
    {
        HashMap <Integer,String>map = new HashMap<Integer,String>();   
        Set <Map.Entry<Integer,String>>set = map.entrySet(); 
        int limit,i,key;
        String val;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements to be added inside HashMap:");
        limit = sc.nextInt();
        for(i=0;i<limit;i++)
        {
            System.out.println("Enter the Key:");
            key = sc.nextInt();
            sc.nextLine();  //Consuming Newline Character
            System.out.println("Enter the Value corresponding to that Key:");
            val = sc.nextLine();   
            map.put(key, val);
            System.out.println("");
        }
        System.out.println("Display Data inside HashMap:");
        for(Map.Entry m:set)
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
