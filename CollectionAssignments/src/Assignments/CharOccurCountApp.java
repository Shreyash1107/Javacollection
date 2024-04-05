package Assignments;
import java.util.*;
public class CharOccurCountApp 
{
    public static void main(String[] args) 
    {
            LinkedHashMap<String,Integer> m = new LinkedHashMap<String,Integer>();
            Set <Map.Entry<String,Integer>> set = m.entrySet();
            Scanner xyz = new Scanner(System.in);
            String str;
            int i,limit;
            System.out.println("Enter the Number of Elements to be Added:");
            limit = xyz.nextInt();
            xyz.nextLine();  //Consuming Newline Character
            System.out.println("Enter the String:");
            str = xyz.nextLine();
            String w[] = str.split(" ");

            for(i=0;i<limit && i<w.length;i++)
            {
                String word = w[i];
                if(m.containsKey(word))
                {
                    m.put(word, m.get(word)+1);
                }
                else
                {
                    m.put(word, 1);
                }
            }
            boolean flag = false;
            System.out.println("Display Occurence of word and Display the Word in String:");
            for(Map.Entry<String,Integer> map : set)
            {
                if(map.getValue()>1)
                {
                    System.out.println(map.getKey() + "---->" + map.getValue());
                    flag = true;
                }
            }
            if(!flag)
            {
                System.out.println("No Character has Occurred More than One time... ");
            }
    }
}
