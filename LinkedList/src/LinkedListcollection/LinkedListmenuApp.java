package LinkedListcollection;
import java.util.*;
public class LinkedListmenuApp 
{
        public static void main(String[] args) 
        {
            int choice;
            Scanner xyz  = new Scanner(System.in);
            LinkedList lst = new LinkedList();
            do
            {
                System.out.println("1.Add Elements inside LinkedList.");
                System.out.println("2.View All tbe Elements inside LinkeList.");
                System.out.println("3.Add Elements at end of the LinkedList.");
                System.out.println("4.Search Value from LinkedList.");
                System.out.println("5.Delete Value From LinkedList.");
                System.out.println("6.Display Total Size of LinkedList.");
                System.out.println("7.Check WHether LinkedList is Empty or Not.");
                System.out.println("8.Travel the LinkedList in Forward as well as in Backward Direction.");
                System.out.println("Enter your choice:");
                choice = xyz.nextInt();
                switch(choice)
                {
                    case 1:
                        int limit,i,val;
                        System.out.println("Enter the Number of Elements to be added inside LinkedList");
                        limit = xyz.nextInt();
                        System.out.println("Enter the Data inside LinkedList:");
                        for(i=0;i<limit;i++)
                        {
                            val = xyz.nextInt();
                            lst.add(val);
                        }
                        break;
                        case 2:
                           System.out.println("Display Data inside LinkedList:");
                           for(Object obj : lst)
                           {
                                System.out.println(obj);
                           }
                           break;
                              case 3:
                              int value;
                              System.out.println("Enter the Value which you want to add inside the LinkedList");
                              value = xyz.nextInt();
                              lst.add(value);
                              System.out.println("Display Updated LinkedList");
                              for(Object obj:lst)
                              {
                                    System.out.println(obj);
                              }
                              break;
                                 case 4:
                                 System.out.println("Enter the Value you want to search out for:");
                                 int skey = xyz.nextInt();
                                 boolean b = lst.contains(skey);
                                 if(b)
                                 {
                                     System.out.println(skey + " is present in LinkedList");
                                 }
                                 else
                                 {
                                        System.out.println(skey + " is not present inside LinkedList");
                                 }
                                 break;
                                   case 5:
                                   System.out.println("Enter the index which you want to remove:");
                                   int ind = xyz.nextInt();
                                   lst.remove(ind);
                                   System.out.println("Updated LinkedList is:" +lst);
                                   break;
                                      case 6:
                                      int size;
                                      size = lst.size();
                                      System.out.println("Size of LinkedLis is:" + size);
                                      break;
                                         case 7:
                                         boolean b1 = lst.isEmpty();
                                         if(b1)
                                         {
                                            System.out.println("LinkedList is Empty.....");
                                         }
                                         else
                                         {
                                            System.out.println("LinkedList is not Empty.....");
                                         }
                                         break;
                                             case 8:
                                             int ch;
                                             System.out.println("*************SUBMENU STARTS************");
                                             do
                                             {
                                                System.out.println("1.Traverse the LinkedList in Forward Direction.");
                                                System.out.println("2.Traverse the LinkedList in Backward Direction.");
                                                System.out.println("Enter your Choice:");
                                                ch = xyz.nextInt();
                                                switch(ch)
                                                {
                                                    case 1:
                                                    ListIterator li = lst.listIterator();
                                                    System.out.println("Fetching Data from LinkedList in Forward Direction:");
                                                    while(li.hasNext())
                                                    {
                                                        Object ob = li.next();
                                                        System.out.println(ob);
                                                    }
                                                    break;
                                                    case 2:
                                                    li = lst.listIterator(lst.size());
                                                    System.out.println("Fetching Data from LinkedList in Backward Direction:");
                                                    while(li.hasPrevious())
                                                    {
                                                        Object obj = li.previous();
                                                        System.out.println(obj);
                                                    }
                                                    break;
                                                    default:
                                                    System.out.println("Submenu Completed");
                                                    break;
                                                } 
                                             }while(ch!=3);

                                             default:
                                             System.out.println("***********Thank You************");
                                             break;
                }
            }while(choice!=9);
        }
}
