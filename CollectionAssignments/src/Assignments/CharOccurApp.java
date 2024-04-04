package Assignments;
import java.util.*;
public class CharOccurApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        Set <Map.Entry<Character,Integer>> set = map.entrySet();
        String str;
        int limit,i;
        System.out.println("Enter the Number of Data to be added inside Map:");
        limit = xyz.nextInt();
        System.out.println("");
        xyz.nextLine();  //consuming Newline Character
        System.out.println("Enter the String:");
        str = xyz.nextLine();    
        for(char ch : str.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch, 1);
            }
        }
        boolean flag = false;
        System.out.println("Display Occurence of Character in String:");
        for(Map.Entry<Character,Integer> m2 : set)
        {
            System.out.println(m2.getKey() + " = " + m2.getValue());
            flag = true;
        }
        if(!flag)
        {
            System.out.println("No Character has Repeated in Given String....");
        }
    }
}
