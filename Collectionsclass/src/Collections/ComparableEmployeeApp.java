package Collections;
import java.util.*;
class Employee
{
    private int id;
    private int sal;
    private String name;
    public void setid(int id)
    {
        this.id = id;
    }
    public int getid()
    {
        return id;
    }
    public void setsal(int sal)
    {
        this.sal = sal;
    }
    public int getsal()
    {
        return sal;
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
public class ComparableEmployeeApp 
{
    public static void main(String[] args) 
    {
        Employee emp[] = new Employee[3];
        ArrayList al = new ArrayList();
            int choice;
            Scanner xyz = new Scanner(System.in);
            do
            {
                System.out.println("1.Sort Employee By Id:");
                System.out.println("2.Sort Employee by Salary.");
                System.out.println("Enter the CHoice:");
                choice = xyz.nextInt();
                switch(choice)
                {
                    case 1:
                    int i,id,sal;
                    String name;
                    for(i=0;i<emp.length;i++)
                    {
                        emp[i] = new Employee();
                        System.out.println("Enter the Employee's Id:");
                        id = xyz.nextInt();
                        emp[i].setid(id);
                        System.out.println("Enter the Name of the Employee:");
                        xyz.nextLine();  //Consuming Newline Character
                        name = xyz.nextLine();
                        emp[i].setname(name);
                        System.out.println("Enter the Salary of the Employee:");
                        sal = xyz.nextInt();
                        emp[i].setsal(sal);
                        al.add(emp[i]);
                    }
                    System.out.println("Display Data before Sorting:");
                    for(Object obj:al)
                    {
                        Employee employee = (Employee)obj;
                        System.out.println(employee.getid() + " " + employee.getname() + " " + employee.getsal());
                    }
                    Sortemployeebyid sempbyid = new Sortemployeebyid();
                    Collections.sort(al,sempbyid);
                    System.out.println("Display Data after Sorting by Id:");
                    for(Object obj:al)
                    {
                        Employee employee = (Employee)obj;
                        System.out.println(employee.getid() + " " + employee.getname() + " " + employee.getsal());
                    }
                    break;
                        case 2:
                        System.out.println("Display Employee Details Before Sorting:");
                        for(Object obj:al)
                        {
                            Employee employee = (Employee)obj;
                            System.out.println(employee.getid() + " " + employee.getname() + " " + employee.getsal());
                        }
                        Sortemployeebysal sempbysal = new Sortemployeebysal();
                        Collections.sort(al,sempbysal);
                        System.out.println("Display Sorted Employee Data by Salary:");
                        for(Object obj:al)
                        {
                            Employee employee = (Employee)obj;
                            System.out.println(employee.getid() + " " + employee.getname() + " " + employee.getsal());
                        }
                        break;
                        default:
                        System.out.println("Exit");
                        break;
                }
            }while(choice!=3);
    }
}
