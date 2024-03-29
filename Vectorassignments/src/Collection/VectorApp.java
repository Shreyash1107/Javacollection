package Collection;
import java.util.*;
class Employee
{
    private int id;
    private String name;
    private int sal;
    public void setid(int id)
    {
        this.id = id;
    }
    public int getid()
    {
        return id;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }
    public void setsal(int sal)
    {
        this.sal = sal;
    }
    public int getsal()
    {
        return sal;
    }
}
public class VectorApp 
{
    public static void main(String[] args) 
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        do
        {
            System.out.println("1.Add the Employee's Inside Vector:");
            System.out.println("2.View All Employee Data inside Vector:");
            System.out.println("3.Search Employee By using it's Id:");
            System.out.println("4.Delete Employee by using it's Id:");
            System.out.println("Enter your Choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                   int i,id,sal;
                   String name;
                   Employee emp[] = new Employee[3];
                   for(i=0;i<emp.length;i++)
                   {
                        emp[i] = new Employee();
                        System.out.println("Enter the Employee's Id:");
                        id = sc.nextInt();
                        emp[i].setid(id);
                        System.out.println("Enter the Name of the Employee:");
                        sc.nextLine();  //Consuming Newline Character
                        name = sc.nextLine();
                        emp[i].setname(name);
                        System.out.println("Enter the Employee's Salary:");
                        sal = sc.nextInt();
                        emp[i].setsal(sal);
                        v.add(emp[i]);
                   }
                   break;
                   case 2:
                       System.out.println("Display Employee info:");
                       for(Object obj:v)
                       {
                            Employee e = (Employee)obj;
                            System.out.println(e.getid() + "  " + e.getname() + "  " + e.getsal());
                       }
                       break;
                         case 3:
                         int eid,flag=0;
                         System.out.println("Enter the Employee Id to Search for:");
                         eid = sc.nextInt();
                         for(Object obj:v)
                         {
                            Employee e = (Employee)obj;
                            if(e.getid()==eid)
                            {
                                flag=1;
                                break;
                            }
                         }
                         if(flag==1)
                         {
                            System.out.println("Employee with Id " + eid + " is Present inside Vector");
                         }
                         else
                         {
                            System.out.println("Employee with Id " + eid + " is not Present inside Vector");
                         }
                         break;
                            case 4:
                            System.out.println("Enter the Id which you want to remove:");
                            eid = sc.nextInt();
                            for(i=0;i<v.size();i++)
                            {
                                Employee e = (Employee)v.get(i);
                                if(e.getid()==eid)
                                {
                                    flag = 1;
                                    v.remove(i);
                                    i--;
                                }
                            }
                            System.out.println("Display Updated Vector:");
                            for(i=0;i<v.size();i++)
                            {
                                Employee e = (Employee)v.get(i);
                                System.out.println(e.getid() + "  " + e.getname() + "  " + e.getsal());
                            }
                            break;
                                default:
                                System.out.println("Thank You");
                                break;
            }
        }   while(choice!=5); 
    }
}
