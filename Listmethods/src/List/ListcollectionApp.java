package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListcollectionApp 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        Scanner xyz = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("1.Add and Display Eleemnts inside List Collection.");
            System.out.println("2.Display any Element from List Collection using Index.");
            System.out.println("3.Search particular Element from List using Index.");
            System.out.println("4. Replace the Element in Collection.");
            System.out.println("5.Insert new Element inside Collection.");
            System.out.println("6.Remoce Element from Collection.");
            System.out.println("7.Display Index of Element from Collection.");
            System.out.println("8.Fetch Collection in forward as well as in backward Direction.");
            System.out.println("9.Display Elements between 2 index and display it in the 3rd temporary Collection.");
            System.out.println("Enter the Choice:");
            choice = xyz.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Elements inside Collection:");
                   int i;
                   for(i=0;i<5;i++)
                   {
                       int val = xyz.nextInt();
                       al.add(val);
                   }
                   System.out.println("Display Elements in Collection:");
                  System.out.println(al);
                  break;
                  case 2:
                  int index;
                  System.out.println("Enter the Index:");
                  index = xyz.nextInt();
                  System.out.println("Element at Index " + index + " is " + al.get(index));
                  break;
                  case 3:
                  System.out.println("Enter the Index for Searching:");
                  index = xyz.nextInt();
                  try
                  {
                      System.out.println("Element with Index " + index + " is present in Collection and it is " + al.get(index));
                  }
                  catch(Exception ex)
                  {
                      System.out.println("Data Not Present");
                  }
                  break;
                  case 4:
                  System.out.println("Enter the Index and Value for Replacing inside Collection:");
                  index = xyz.nextInt();
                  int val=xyz.nextInt();
                  al.set(index, val);
                  System.out.println("Updated Collection is:" + al);
                  break;
                  case 5:
                  System.out.println("Enter the Index and Element for Insertion:");
                  index = xyz.nextInt();
                  val = xyz.nextInt();
                  al.add(index,val);
                  System.out.println("Updated COllection is:" +al);
                  break;
                  case 6:
                  System.out.println("Enter the Index for Removing Element from Collection:");
                  index = xyz.nextInt();
                  al.remove(index);
                  System.out.println("Updated Collection is:" + al);
                  break;
                  case 7:
                  System.out.println("Enter the Element to find it's Index");
                  val = xyz.nextInt();
                  System.out.println("Index of " + val + " is " + al.indexOf(val));
                  if(al.indexOf(val)!=-1)
                  {
                       System.out.println("Data Present");
                  }
                  break;
                  case 8:
                  int ch;
                  do
                  {
                    System.out.println("Sub-Menu Part:");
                    System.out.println("1.Fetch Collection in Forward Direction using ListIterator.");
                    System.out.println("2.Fetch Collection in Backward Direction using ListIterator.");
                    System.out.println("Enter the Choice:");
                    ch = xyz.nextInt();
                    switch(ch)
                    {
                        case 1:
                        System.out.println("Data in Collection in forward Direction is:");
                        ListIterator li = al.listIterator();
                        while(li.hasNext())
                        {
                            System.out.println(li.next());
                        }
                        break;
                        case 2:
                        System.out.println("Data Inside Collection in Backward Direction is:");
                        ListIterator lst = al.listIterator(al.size()-1);
                        while(lst.hasPrevious())
                        {
                            System.out.println(lst.previous());
                        }
                        break;
                        default:
                        System.out.println("Wrong Choice Given");
                        break;
                    }
                  }while(ch!=3);
                  break;
                  case 9:
                  System.out.println("Enter the first and Second Index:");
                  index = xyz.nextInt();
                  int ind = xyz.nextInt();
                  List lst = al.subList(index, ind);
                  System.out.println("Display the Third Temporary List Created:" +lst);
                  break;
                  default:
                  System.out.println("Wrong Input By User");
                  break;
            }
        }   while(choice!=10); 
    }
}