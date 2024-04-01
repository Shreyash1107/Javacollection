package Application;
import java.util.*;
class Employee
{
    private int id;
    private String name;
    private int sal;
    public Employee()
    {

    }
    public Employee(int id, String name, int sal)
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
}
public class EmployeegenApp 
{
    public static void main(String[] args) 
    {
        ArrayList<Employee>al = new ArrayList<>();
        Scanner xyz = new Scanner(System.in);
        Employee emp[] = new Employee[5];
        int i,id,sal;
        String name;
        for(i=0;i<emp.length;i++)
        {
            emp[i] = new Employee();
            System.out.println("Enter the Id of a Employee:");
            id = xyz.nextInt();
            emp[i].setid(id);
            System.out.println("Enter the Name of the Employee:");
            xyz.nextLine();
            name = xyz.nextLine();
            emp[i].setname(name);
            System.out.println("Enter the Salary of the Employee:");
            sal = xyz.nextInt();
            emp[i].setsal(sal);
            emp[i] = new Employee(id, name, sal);
            al.add(emp[i]);
        }
        System.out.println("Display Employee Details:");
        for(Employee e:al)
        {
            System.out.println(e.getid() + " " + e.getname() + " " + e.getsal());
        }
    }
}
