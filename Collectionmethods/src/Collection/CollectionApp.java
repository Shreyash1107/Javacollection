package Collection;
import java.util.*;
public class CollectionApp 
{
    public static void main(String[] args) 
    {
        int choice;
        ArrayList al = new ArrayList();
        ArrayList al2 = new ArrayList();
        ArrayList al3 = new ArrayList();
        Scanner xyz = new Scanner(System.in);
        do
        {
            System.out.println("1.Add and Display Elements inside Collection.");
            System.out.println("2.Find Size of the Collection.");
            System.out.println("3. Check Whether collection is Empty or Not.");
            System.out.println("4.Check Whether Element is Present inside Collection or Not.");
            System.out.println("5.Add an Element inside Collection.");
            System.out.println("6.Access Collection Data through Iterator.");
            System.out.println("7.Convert Collection to Object Class Array.");
            System.out.println("8.Remove Element from Collection.");
            System.out.println("9.Check Whether Multiple Elements are Present inside Collection or not.");
            System.out.println("10.Add Multiple Eleemnts inside Collection.");
            System.out.println("Enter the Choice:");
            choice = xyz.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter the Elements inside Collection:");
                int val,i;
                for(i=0;i<5;i++)
                {
                    val = xyz.nextInt();
                    al.add(val);
                }
                System.out.println("Display Elements entered in Collection:");
                System.out.println(al);
                break;
                case 2:
                int size = al.size();
                System.out.println("Size of Collection is:" + size);
                break;
                case 3:
                boolean b = al.isEmpty();
                if(b)
                {
                    System.out.println("Collection is Empty.");
                }
                else
                {
                    System.out.println("Collection is not Empty...");
                }
                break;
                case 4:
                int skey;
                System.out.println("Enter the Value to search for:");
                skey = xyz.nextInt();
                b = al.contains(skey);
                if(b)
                {
                    System.out.println(skey + " is present inside Collection.");
                }
                else
                {
                    System.out.println(skey + " is not present insdie Collection.");
                }
                break;
                case 5:
                System.out.println("Enter the Element to be added inside Collection:");
                int value = xyz.nextInt();
                b = al.add(value);
                if(b)
                {
                    System.out.println(value + " is successfully added inside Collection.");
                }
                else
                {
                    System.out.println(value + " is not added inside Collection.");
                }
                System.out.println(al);
                break;
                case 6:
                Iterator I = al.iterator();
                System.out.println("Collection data is:");
                while(I.hasNext())
                {
                    Object ob = I.next();
                    System.out.println(ob);
                }
                break;
                case 7:
                System.out.println("Converted Collection in Object Class Array is:");
                for(Object obj:al)
                {
                    System.out.println(obj);
                }
                break;
                case 8:
                al.remove(3);
                System.out.println("Updated Collection is:" + al);
                break;
                case 9:
                int val3;
                System.out.println("Add new Elements inside Collection:");
                for(i=0;i<5;i++)
                {
                    val3 = xyz.nextInt();
                    al2.add(val3);
                }
                System.out.println("New Collection is:");
                System.out.println(al2);
                b = al.containsAll(al2);
                if(b)
                {
                    System.out.println("All Elemetns from New Collection are Present insde Old one.");
                }
                else
                {
                    System.out.println("No Elements are present from New Collection to Previous one.");
                }
                break;
                case 10:
                int val4;
                for(i=0;i<5;i++)
                {
                    val4 = xyz.nextInt();
                    al3.add(val4);
                }
                System.out.println(al2);
                b = al.addAll(al3);
                if(b)
                {
                    System.out.println("All Elements from New ArrayList has been Added to Previous one Successfully.");
                }
                else
                {
                    System.out.println("Elements has not been added to Previous one Collection Successfully.");
                }
                System.out.println("Updated Collection is:" + al);
                break;
                default:
                System.out.println("Wrong Choice");
                break;
            }
        }   while(choice!=11); 
    }
}