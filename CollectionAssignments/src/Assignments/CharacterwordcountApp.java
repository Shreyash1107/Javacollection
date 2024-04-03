package Assignments;
import java.util.*;
public class CharacterwordcountApp 
{
    public static void main(String[] args) 
    {
        Vector <String> v = new Vector<String>();
        Scanner xyz = new Scanner(System.in);
        int limit,i;
        String value;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = xyz.nextInt();
        xyz.nextLine();  //Consuming newline Character
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            value = xyz.nextLine();
            v.add(value);
        }    
        System.out.println("Display Data inside Vector:");
        for(String s : v)
        {
            System.out.println(s);
        }
        System.out.println("Display Occurrence of Character and Words inside Vector:");
        for(i=0;i<limit;i++)
        {
            value = v.get(i);
            int len;
            len = value.length();
            String word[] = value.split(" ");
            int wordcount = word.length;
            System.out.println(i + "---->" + len + " " + wordcount);
        }
    }
}
