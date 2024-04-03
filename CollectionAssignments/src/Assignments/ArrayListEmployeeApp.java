package Assignments;
import java.util.*;
class Employee
{
    private int id;
    private String name;
    public Employee()
    {

    } 
    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
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
}
public class ArrayListEmployeeApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        ArrayList <Employee> al = new ArrayList<Employee>();
        int i,eid;
        String name;
        Employee emp[] = new Employee[5];
        for(i=0;i<emp.length;i++)
        {
            emp[i] = new Employee();
            System.out.println("Enter the Employee's Id:");
            eid = xyz.nextInt();
            emp[i].setid(eid);
            System.out.println("Enter the Name of the Employee:");
            xyz.nextLine();  //Consuming newline Character
            name = xyz.nextLine();
            emp[i].setname(name);
            al.add(emp[i]);
            System.out.println("");
        }
        System.out.println("Display Employee Data:");
        for(Employee e : al)
        {
            System.out.println(e.getid() + " " + e.getname());
        } 
    }
}
