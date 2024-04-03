package MapImplementations;
import java.util.*;
public class CharcountApp 
{
    public static void main(String[] args) 
    {
            LinkedHashMap <Character,Integer>map = new LinkedHashMap<Character,Integer>();
            Set <Map.Entry<Character,Integer>>set = map.entrySet();
            String str;
            Scanner xyz = new Scanner(System.in);
            System.out.println("Enter the String:");
            str = xyz.nextLine();
            // char c;
            for(char c:str.toCharArray())//Traversing through complete String 
            {
                if(map.containsKey(c))
                {
                    map.put(c, map.get(c)+1);
                }
                else
                {
                    map.put(c, 1);
                }
            }
            System.out.println("Display Character with Occurrence:");
            for(Map.Entry m:set)
            {
                System.out.println(m.getKey() + "---->" + m.getValue());
            }
    }
}
