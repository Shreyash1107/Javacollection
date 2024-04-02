package MapImplementations;
import java.util.*;
public class MapmethodsImplementationsApp 
{
    public static void main(String[] args) 
    {
        Map <Integer,String> m = new LinkedHashMap<>();
        Map <Integer,String> m1 = new LinkedHashMap<>();
        Scanner xyz = new Scanner(System.in);
        Set <Map.Entry<Integer,String>> entry = m.entrySet();
        Set <Map.Entry<Integer,String>> entry1 = m1.entrySet();
        int choice;
        do
        {
            System.out.println("1.Add Entries to the Map and Display.");
            System.out.println("2.Display The Size of the Map.");
            System.out.println("3.Check Whether the Map is Empty or Not.");
            System.out.println("4.Search The Data inside Map.");
            System.out.println("5.Get the Data inside Map.");
            System.out.println("6.Remove the Data inside Map.");
            System.out.println("7.Add new Entries to the Map and Display.");
            System.out.println("8.Clear all Data from the Map.");
            System.out.println("9.Display all the Keys and values from the Map.");
            System.out.println("");
            System.out.println("Enter the Choice:");
            choice = xyz.nextInt();
            System.out.println("");
            switch(choice)
            {
                case 1:
                    int limit,i,key;
                    String val;
                    System.out.println("Enter the Number of Elements to be Added inside Map:");
                    limit = xyz.nextInt();
                    for(i=0;i<limit;i++)
                    {
                        System.out.println("Enter the Key to be Added:");
                        key = xyz.nextInt();
                        xyz.nextLine();  //Consuming Newline Character
                        System.out.println("Enter the Value Corresponding to that Key:");
                        val = xyz.nextLine();
                        m.put(key, val);
                        System.out.println("");  //for spacing between 2 Statements
                    }
                    System.out.println("");
                    for(Map.Entry map:entry)
                    {
                        System.out.println(map.getKey() + " " + map.getValue());
                    }
                    System.out.println("");
                    break;
                        case 2:
                        int len;
                        len = m.size();
                        System.out.println("Size of the Map is:" + len);
                        System.out.println("");
                        break;
                            case 3:
                            boolean b = m.isEmpty();
                            if(b)
                            {
                                System.out.println("Map is Empty....");
                            }
                            else
                            {
                                System.out.println("Map is Not Empty....");
                            }
                            System.out.println("");
                            break;
                                case 4:
                                int ch;
                                do
                                {
                                    System.out.println("**********SUBMENU STARTED***********");
                                    System.out.println("");
                                    System.out.println("1.Search the Data inside Map Using Key.");
                                    System.out.println("2.Search Data inside Map Using Value.");
                                    System.out.println("");
                                    System.out.println("Enter the Choice:");
                                    ch = xyz.nextInt();
                                    System.out.println("");
                                    switch(ch)
                                    {
                                        case 1:
                                        System.out.println("Enter the Key to be Searched for:");
                                        key = xyz.nextInt();
                                        boolean b1 = m.containsKey(key);
                                        if(b1)
                                        {
                                            System.out.println(key + " is Present inside Map.....");
                                            Object obj = m.get(key);
                                        } 
                                        else
                                        {
                                            System.out.println(key + " is not Present inside Map.....");
                                        }
                                        System.out.println("");
                                        break;
                                            case 2:
                                            System.out.println("Enter the Value to be Searched for Inside Map:");
                                            xyz.nextLine();  //Consuming Newline Character
                                            val = xyz.nextLine();
                                            b1 = m.containsValue(val);
                                            if(b1)
                                            {
                                                System.out.println(val + " is Present inside Map....");
                                               Object obj = m.get(val);
                                            }  
                                            else
                                            {
                                                System.out.println(val + " is not Present Inside Map....");
                                            }
                                            System.out.println("");
                                            break;
                                                default:
                                                System.out.println("**********SUBMENU PART FINISHED**********");
                                                System.out.println("");
                                                break;
                                    }
                                }while(ch!=3);
                                    case 5:
                                      int ch1;
                                      do
                                      {
                                            System.out.println("****************SUBMENU PART STARTED***********");
                                            System.out.println("1.Fetch All The data From Map using get method.");
                                            System.out.println("2.Search Data From Map using get method.");
                                            System.out.println("");
                                            System.out.println("Enter your choice:");
                                            ch1 = xyz.nextInt();
                                            System.out.println("");
                                            switch(ch1)
                                            {
                                                case 1:
                                                System.out.println("Enter the Key for Displaying Data:");
                                                key = xyz.nextInt();
                                                Object obj = m.get(key);
                                                System.out.println(obj);
                                                System.out.println("");
                                                break;
                                                    case 2:
                                                    // xyz.nextLine(); //Consuming Newline Character
                                                    System.out.println("Enter the Key to Search For:");
                                                    key = xyz.nextInt();
                                                    obj = m.get(key);
                                                    if(obj!=null)
                                                    {
                                                        System.out.println(key + " is Present inside Map.....");
                                                    } 
                                                    else
                                                    {
                                                        System.out.println(key + " is not Present inside Map....");
                                                    }
                                                    System.out.println("");
                                                    break;
                                                        default:
                                                        System.out.println("******************SUBMENU PARTS FINISHED*************");
                                                        System.out.println("");
                                                        break;
                                            }
                                      }while(ch1!=3);
                                            case 6:
                                            System.out.println("Enter the Key to remove form Map:");
                                            key = xyz.nextInt();
                                            Object obj = m.remove(key);
                                            System.out.println("Display Map Data After removal:");
                                            for(Map.Entry map:entry)
                                            {
                                                 System.out.println(map.getKey() + " " + map.getValue());
                                            }
                                            System.out.println("");
                                            break;
                                                case 7:
                                                System.out.println("Enter the Number of Elntrie to be Added inside Map:");
                                                limit = xyz.nextInt();
                                                 for(i=0;i<limit;i++)
                                                 {
                                                        System.out.println("Enter the Key:");
                                                        key = xyz.nextInt();
                                                        xyz.nextLine();  //Consuming newline Character
                                                        System.out.println("Enter the Value corresponding to Key:");
                                                        val = xyz.nextLine();
                                                        m1.put(key, val);
                                                        System.out.println(""); 
                                                 }
                                                 System.out.println("Display Map Data After addition:");
                                                 for(Map.Entry map:entry1)
                                                 {
                                                      System.out.println(map.getKey() + " " + map.getValue());
                                                 }
                                                 m1.putAll(m);
                                                 for(Map.Entry map:entry)
                                                 {
                                                      System.out.println(map.getKey() + " " + map.getValue());
                                                 }
                                                 System.out.println("");
                                                 break;
                                                    case 8:
                                                    m.clear();
                                                    System.out.println("Display Map Data if there:");
                                                     for(Map.Entry map:entry)
                                                     {
                                                         System.out.println(map.getKey() + " " + map.getValue());
                                                     }
                                                     break;
                                                        case 9:
                                                        System.out.println("Display Map Data:");
                                                        for(Map.Entry map:entry)
                                                        {
                                                            System.out.println(map.getKey() + " " + map.getValue());
                                                        }
                                                        System.out.println("");
                                                        break;
                                                            default:
                                                            System.out.println("***************THANK YOU*********");
                                                            System.out.println("");
                                                            break;

            }
        }   while(choice!=10); 
    }
}
