package Assignments;
import java.util.*;
class employee implements Comparable<employee>
{
    private int id;
    private String name;
    private int sal;
   public employee()
   {

   }
   public employee(int id,String name,int sal)
   {
        this.id = id;
        this.name = name;
        this.sal = sal;
   }
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
@Override
public int compareTo(employee v) 
{
    if(this.id>v.id)
    {
        return 1;
    }
    else if(this.id<v.id)
    {
        return -1;
    }
    else
    {
        return 0;
    }
}
}
public class EmployeesortApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        ArrayList <employee> al = new ArrayList<employee>();
        int id,i,sal;
        String name;
        employee emp[] = new employee[5];
        for(i=0;i<emp.length;i++)
        {
            emp[i] = new employee();
            System.out.println("Enter the Employee's Id:");
            id = xyz.nextInt();
            emp[i].setid(id);
            System.out.println("Enter the Name of the Employee:");
            xyz.nextLine();
            name = xyz.nextLine();
            System.out.println("Enter the Salary of the Employee:");
            sal = xyz.nextInt();
            emp[i].setsal(sal);
            al.add(emp[i]);
            System.out.println("");
        }   
        System.out.println("Display Employee Data before Sorting:");
        for(employee e : al)
        {
            System.out.println(e.getid() + " " + e.getname() + " " + e.getsal());
            System.out.println("");
        }
        System.out.println("Display Employee Data after Sorting:");
        Collections.sort(al);
        for(employee e : al)
        {
            System.out.println(e.getid() + " " + e.getname() + " " + e.getsal());
        }
    }
}
