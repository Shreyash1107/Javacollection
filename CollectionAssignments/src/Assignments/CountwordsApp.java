package Assignments;
import java.util.*; 
public class CountwordsApp 
{
    public static void main(String[] args) 
    {
        Vector <String> v = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        int limit,i;
        String val;
        System.out.println("Enter the Number of Elements to be added inside Vector:");
        limit = sc.nextInt();
        sc.nextLine();  //Consuming NewLine Character
        System.out.println("Enter the Data inside Vector:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextLine();
            v.add(val);
        }
        System.out.println("Display Data inside Vector:");
        for(String s : v)
        {
            System.out.println(s);
        }
        System.out.println("Display Occurence of Word Present on Every Index:");
        for(i=0;i<limit;i++)
        {
           val = v.get(i);
           String w[] = val.split(" ");
           int wcount;
           wcount = w.length;
           System.out.println(i + "---->" + wcount);
        }
    }
}
