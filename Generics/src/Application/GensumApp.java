package Application;
import java.util.*;
public class GensumApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>al = new ArrayList<>();
        int i,limit,val;
        System.out.println("Enter the Number of Elements to be added inside ArrayList:");
        limit = sc.nextInt();
        System.out.println("Enter the Data inside ArrayList:");
        for(i=0;i<limit;i++)
        {
            val = sc.nextInt();
            al.add(val);
        }    
        System.out.println("Display Data inside ArrayList:");
        for(Integer Int:al)
        {
            System.out.println(Int);
        }
        int sum=0;
        for(Integer Int:al)
        {
            sum = sum + Int;
        }
        System.out.println("Sum of All Values is:" + sum);
    }
}
