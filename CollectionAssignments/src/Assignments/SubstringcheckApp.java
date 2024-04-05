package Assignments;
import java.util.*;
public class SubstringcheckApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        LinkedHashMap <Integer,String> map = new LinkedHashMap<Integer,String>();
        Set <Map.Entry<Integer,String>> entry = map.entrySet();
        String str;
        System.out.println("Enter the String:");
        str = xyz.nextLine();
        String substr;
        System.out.println("Enter the SubString:");
        substr = xyz.nextLine();
        int i;
        String str1[] = str.split(" ");
        int flag=-1;
        for(i=0;i<str1.length;i++)
        {
            String w = str1[i];
            if(w.contains(substr))
            {
                flag = 1;
                map.put(i, substr);
            }
        }
        if(flag==1)
        {
            for(Map.Entry<Integer,String> m1 : entry)
            {
                System.out.println("Index: " + m1.getKey()+ " " + " Substring: " + " " + m1.getValue());
            }
        }
        else
        {
            System.out.println("Substring is not Present.....");
        }
    }
}
