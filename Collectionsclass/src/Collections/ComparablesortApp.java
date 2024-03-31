package Collections;
import java.util.*;
class Employee implements Comparable
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
    @Override
    public int compareTo(Object obj)
    {
        Employee emp = (Employee)obj;
        if(this.id>emp.id)
        {
            return 1;
        }
        else if(this.id<emp.id)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
public class ComparablesortApp 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        Scanner xyz = new Scanner(System.in);
        int i,id,sal;
        String name;
        Employee emp[] = new Employee[5];
        for(i=0;i<emp.length;i++)
        {
            emp[i] =  new Employee();
            System.out.println("Enter the Employee's Id:");
            id = xyz.nextInt();
            emp[i].setid(id);
            System.out.println("Enter the Employee's Name:");
            xyz.nextLine();  //Consuming Newline Character
            name = xyz.nextLine();
            emp[i].setname(name);
            System.out.println("Enter the Salary of the Employee:");
            sal = xyz.nextInt();
            emp[i].setsal(sal);
            al.add(emp[i]);
        }
        System.out.println("Dislay The Employee Data before Sorting:");
        for(Object obj:al)
        {
            Employee employee = (Employee)obj;
            System.out.println(employee.getid() +  "  " +  employee.getname() +  "  "  + employee.getsal());
        }
        Collections.sort(al);
        System.out.println("Display Data After Sorting:");
        for(Object obj:al)
        {
            Employee employee = (Employee)obj;
            System.out.println(employee.getid() +  "  " +  employee.getname() +  "  "  + employee.getsal());
        }
    }
}
