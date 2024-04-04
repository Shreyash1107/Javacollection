package Assignments;
import java.util.*;
public class repititivewordApp 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
        Set <Map.Entry<String,Integer>> entry = map.entrySet();
        Scanner xyz = new Scanner(System.in);
        int limit,i;
        String str;
        System.out.println("Enter the Number of Elements to be added inside Map:");
        limit = xyz.nextInt();
        xyz.nextLine();  //Consuming Newline Character
        System.out.println("Enter the String:");
        str = xyz.nextLine();
        String word[] = str.split(" ");  //Splitting the Complete String qa there may be spaces in between words
        for(i=0;i<limit && i<word.length;i++)
        {
            String w = word[i];
            if(map.containsKey(w))
            {
                map.put(w,map.get(w)+1);
            }
            else
            {
                map.put(w, 1);
            }
        }
        int flag=-1;
        System.out.println("Display Repeated words inside String:");
        for(Map.Entry<String,Integer> m1 : entry)
        {
            if(m1.getValue()>1)
            {
                System.out.print(m1.getKey() + " ");
                flag=1;
            }
        }
        if(flag!=1)
        {
            System.out.println(str + " does not have any repeated words.");
        }
    }
}
