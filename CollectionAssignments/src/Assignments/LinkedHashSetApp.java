package Assignments;
import java.util.*;
class Employees
{
    private int id;
    private String name;
    private int sal;
    public Employees()
    {

    }
    public Employees(int id,String name,int sal)
    {
        this.id =id;
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
}
public class LinkedHashSetApp 
{
    public static void main(String[] args) 
    {
        LinkedHashSet <Employees> set = new LinkedHashSet<Employees>();
        Scanner xyz = new Scanner(System.in);
        int eid,sal,i;
        String name;
        Employees e[] = new Employees[5];
        for(i=0;i<e.length;i++)
        {
            e[i] = new Employees();
            System.out.println("Enter the Employe's Id:");
            eid = xyz.nextInt();
            e[i].setid(eid);
            System.out.println("Enter the Name of the Employee");
            xyz.nextLine();  //Consuming newline Character
            name = xyz.nextLine();
            e[i].setname(name);
            System.out.println("Enter the Salary of Employee:");
            sal = xyz.nextInt();
            e[i].setsal(sal);
            e[i] = new Employees(eid, name, sal);
            set.add(e[i]);
            System.out.println("");
        }
        System.out.println("Display Employee Details:");
        for(Employees employee : set)
        {
            System.out.println(employee.getid() + " " + employee.getname() + " " + employee.getsal());
        }
    }
}
