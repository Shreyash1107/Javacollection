package Collection;
import java.util.*;
public class VectorcharwordscountApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        int limit,i;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = sc.nextInt();
        String str;
        sc.nextLine();  //Consuming Newline Character
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            str = sc.nextLine();
            v.add(str);
        }
        System.out.println("Display Data inside Vector");
        for(Object obj:v)
        {
            System.out.println(obj);
        }
        System.out.println("Display the count of words and Characters:");
        for(i=0;i<limit;i++)
        {
            str = (String)v.get(i);
            int charcount;
            charcount = str.length(); 
            String wordscount[] = str.split(" ");
            int wordcount;
            wordcount = wordscount.length;
            System.out.println(i + " " + wordcount + " " + charcount); 
        }
    }
}