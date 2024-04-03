package MapImplementations;
import java.util.*;
public class RepeatedcharacterApp 
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
            System.out.print("Display Character with Occurrence are:");
            for(Map.Entry<Character,Integer> m:set)
            {
               if(m.getValue()>1)
               {
                    System.out.print(m.getKey());
               }
               else
               {
                    System.out.println("No Charater Repeated");
                    break;
               }
            }
    }
}
