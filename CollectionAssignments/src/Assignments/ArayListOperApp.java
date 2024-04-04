package Assignments;
import java.util.*;
public class ArayListOperApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int choice;
        do
        {
            System.out.println("1.Sort the Collection in ascending order.");
            System.out.println("2.Find the Maximum value from Collection.");
            System.out.println("3.Reverse the Collection.");
            System.out.println("");
            System.out.println("Enter the Choice:");
            choice = xyz.nextInt();
            switch(choice)
            {
                case 1:
                    int ch;
                    do
                    {
                        System.out.println("********SUBMENU STARTED********");
                        System.out.println("1.Sort the Collection manually.");
                        System.out.println("2.Sort the Collection by using in built method.");
                        System.out.println("");
                        System.out.println("Enter the Choice:");
                        ch = xyz.nextInt();
                        System.out.println("");
                        switch(ch)
                        {
                            case 1:
                                int i,j,limit,val;
                                System.out.println("Enter the Number of Elements to be added inside ArrayList:");
                                limit = xyz.nextInt();
                                System.out.println("Enter the Data inside ArrayList:");
                                for(i=0;i<limit;i++)
                                {
                                     val = xyz.nextInt();
                                     al.add(val);
                                }
                                System.out.println("Display ArrayList Data before Sorting::");
                                for(Integer values : al)
                                {
                                    System.out.println(values);
                                }
                                for(i=0;i<limit;i++)
                                {
                                    for(j=(i+1);j<limit;j++)
                                    {
                                        Integer prev = al.get(i);
                                        Integer next = al.get(j);
                                        if(prev>next)
                                        {
                                            al.set(i, next);
                                            al.set(j, prev);
                                        }
                                    }
                                }
                                System.out.println("Display Data After Sorting:");
                                for(Integer values : al)
                                {
                                    System.out.println(values);
                                }
                                System.out.println("");
                                break;
                                    case 2:
                                    System.out.println("Display Data inside ArrayList before Sorting:");
                                    for(Integer values: al)
                                    {
                                        System.out.println(values);
                                    }
                                    Collections.sort(al);
                                    System.out.println("Display ArrayList Data After Sorting:");
                                    for(Integer values : al)
                                    {
                                        System.out.println(values);
                                    }
                                    System.out.println("");
                                    break;
                                        default:
                                        System.out.println("**************SUBMENU PART ENDS************");
                                        break;
                        }
                    }while(ch!=3);
                            case 2:
                            do
                            {
                                System.out.println("***********SUBMENU STARTS**********");
                                System.out.println("1.Find Maximum Value inside Collection manually.");
                                System.out.println("2.Find Max Value inside Collection using inbuilt method.");
                                System.out.println("");
                                System.out.println("Enter the Choice:");
                                ch = xyz.nextInt();
                                System.out.println("");
                                switch(ch)
                                {
                                    case 1:
                                    System.out.println("Display Data inside ArrayList:");
                                    for(Integer values : al)
                                    {
                                        System.out.println(values);
                                    }
                                    int max = al.get(0);
                                    for(Integer values : al)
                                    {
                                        if(values>max)
                                        {
                                            max = values;
                                        }
                                    }
                                    System.out.println("Maximum Element in ArrayList is:" + max);
                                    System.out.println("");
                                    break;
                                        case 2:
                                        System.out.println("Display Data inside ArrayList:");
                                        for(Integer values : al)
                                        {
                                            System.out.println(values);
                                        }
                                        max =  Collections.max(al);
                                        System.out.println("Maximum Element inside ArrayList is:" + max);
                                        System.out.println("");
                                        break;
                                            default:
                                            System.out.println("*******SUBMENU FINISHED*******");
                                            break;
                                }
                            }while(ch!=3);
                                case 3:
                                System.out.println("Display Data inside ArrayList");
                                for(Integer values : al)
                                {
                                    System.out.println(values);
                                }
                                Collections.reverse(al);
                                System.out.println("Display Collection After reverse:");
                                for(Integer values : al)
                                {
                                    System.out.println(values);
                                }
                                System.out.println("");
                                break;
                                    default:
                                    System.out.println("Exit");
                                    break;
            }
        }while(choice!=4); 
    }
}
