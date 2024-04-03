package Assignments;
import java.util.*;
public class VectorshowApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        Vector<Integer>v = new Vector<Integer>();
        int choice;
        do
        {
            System.out.println("1.Fetch Data from Vector using Iterator.");
            System.out.println("2.Fetch Data from Vector using ListIterator.");
            System.out.println("3.Fetch Data from Vector using Enumeration.");
            System.out.println("4.Fetch Data from Vector using for each.");
            System.out.println("");
            System.out.println("Enter the Choice:");
            choice = xyz.nextInt();
            System.out.println("");
            switch(choice)
            {
                case 1:
                int limit,i,val;
                System.out.println("Enter the Number of Elements to be added inside the Vector:");
                limit = xyz.nextInt();
                System.out.println("Enter the Data inside the Vector:");
                for(i=0;i<limit;i++)
                {
                    val = xyz.nextInt();
                    v.add(val);
                }
                Iterator iter = v.iterator();
                System.out.println( "The elements in the vector are :" );
                while(iter.hasNext())
                {
                    Object obj = iter.next();
                    System.out.println(obj);
                }
                System.out.println("");
                break;
                    case 2:
                    ListIterator li = v.listIterator();
                    System.out.println("Display Data inside vector using ListIterator:");
                    while(li.hasNext())
                    {
                        Object obj = li.next();
                        System.out.println(obj);
                    }
                    System.out.println("");
                    break;
                        case 3:
                        Enumeration em = v.elements();
                        System.out.println("Display Data inside vector using Enumeration:");
                        while(em.hasMoreElements())
                        {
                            Object obj = em.nextElement();
                            System.out.println(obj);
                        }
                        System.out.println("");
                        break;
                            case 4:
                            System.out.println("Display Data inside vector using for each:");
                            for(Integer elements : v)
                            {
                                System.out.println(elements);
                            }
                            System.out.println("");
                            break;
                                default:
                                System.out.println("Invalid Choice");
                                break;
            }
        }while(choice!=5);
    }
}
