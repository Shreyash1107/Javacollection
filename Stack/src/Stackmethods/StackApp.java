package Stackmethods;
import java.util.*;
public class StackApp 
{
    public static void main(String[] args) 
    {
        Stack s = new Stack();
        Scanner xyz = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("1.Enter the Elements inside Stack.");
            System.out.println("2.Display All the Stack Elements.");
            System.out.println("3.Remove topmost Element from Stack.");
            System.out.println("4.Display only the topmost Element from Stack.");
            System.out.println("5.Check Whether Stack is Empty or Not.");
            System.out.println("Enter your Choice:");
            choice = xyz.nextInt();
            switch(choice)
            {
                case 1:
                    int limit,i,val;
                    System.out.println("Enter the number of Elements to be added inside Stack:");
                    limit = xyz.nextInt();
                    System.out.println("Enter the Data inside Stack:");
                    for(i=0;i<limit;i++)
                    {
                        val = xyz.nextInt();
                        s.push(val);
                    }
                    break;
                       case 2:
                       System.out.println("Display Data inside Stack:");
                       for(Object obj:s)
                       {
                            System.out.println(obj);
                       }
                       break;
                         case 3:
                         System.out.println("Display Stack before removing top most Element:");
                         for(Object obj:s)
                         {
                            System.out.println(obj);
                         }
                         s.pop();
                         System.out.println("Display Stack After removing the Top-Most Element:");
                         for(Object obj:s)
                         {
                            System.out.println(obj);
                         }
                         break;
                            case 4:
                            // s.peek();
                            System.out.println("Top Most Element from Stack is:" + s.peek());
                            break;
                                case 5:
                                boolean b = s.isEmpty();
                                if(b)
                                {
                                    System.out.println("Stack is Empty.....");
                                }
                                else
                                {
                                    System.out.println("Stack is not Empty....");
                                }
                                break;
                                    default:
                                    System.out.println("***************Exit*******************");
                                    break;
            }
        }   while(choice!=6); 
    }
}
