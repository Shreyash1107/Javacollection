package MapImplementations;
import java.util.*;
public class vowelcountApp 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<Character,Integer>map = new LinkedHashMap<Character,Integer>(); 
        Set <Map.Entry<Character,Integer>>set = map.entrySet();
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the String:");
        str = sc.nextLine();
        for(char c:str.toCharArray())
        {
            if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u') || (c=='A' || c=='E' || c=='I' || c=='O' || c=='U'))
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
        }   
        System.out.println("Display Occurrence of Vowels Present Inside The String:");
        for(Map.Entry<Character,Integer> m:set)
        {
            System.out.println(m.getKey() + "----->" + m.getValue());
        }
    }
}
