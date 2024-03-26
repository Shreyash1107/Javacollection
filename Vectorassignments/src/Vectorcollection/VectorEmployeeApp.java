package Vectorcollection;
import java.util.*;
class Employee
{
    private int id;
    private int sal;
    private String name;
    public void setid(int id)
    {
        this.id=id;
    }
    public int getid()
    {
        return id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setsalary(int sal)
    {
        this.sal=sal;
    }
    public int getsalary()
    {
        return sal;
    }
}
public class VectorEmployeeApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        int id,sal;
        String name;
        Employee emp1 = new Employee();
        System.out.println("Enter the Employee Id:");
        id = sc.nextInt();
        emp1.setid(id);
        System.out.println("Enter the Name of the Employee:");
        sc.nextLine();  //Consuming Newline Character
        name = sc.nextLine();
        emp1.setname(name);
        System.out.println("Enter the Salary of the Employee:");
        sal = sc.nextInt();
        emp1.setsalary(sal);
        Employee emp2 = new Employee();
        System.out.println("Enter the Employee's Id:");
        id = sc.nextInt();
        emp2.setid(id);
        System.out.println("Enter the Name of the Employee:");
        sc.nextLine();  //Consuming Newline Character
        name = sc.nextLine();
        emp2.setname(name);
        System.out.println("Enter the Salary of the Employee:");
        sal = sc.nextInt();
        emp2.setsalary(sal);
        Employee emp3 = new Employee();
        System.out.println("Enter the Employee's Id:");
        id = sc.nextInt();
        emp3.setid(id);
        System.out.println("Enter the Name of the Employee:");
        sc.nextLine(); //Consuming Newline Character
        name = sc.nextLine();
        emp3.setname(name);
        System.out.println("Enter the Salary of the Employee:");
        sal = sc.nextInt();
        emp3.setsalary(sal);
        v.add(emp1);
        v.add(emp2);
        v.add(emp3);
        System.out.println("Display Employee Data:");
        for(Object obj:v)
        {
           Employee emp = (Employee)obj;
           System.out.println(emp.getid() + " " + emp.getname() +" " + emp.getsalary());
        }
    }
}
