package Assignments;
import java.util.*;
class Employeesal implements Comparable <Employeesal>
{
    private int id;
    private int sal;
    private String name;
    public Employeesal()
    {

    }
    public Employeesal(int id,int sal,String name)
    {
        this.id=id;
        this.sal=sal;
        this.name=name;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public int getid()
    {
        return id;
    }
    public void setsal(int sal)
    {
        this.sal=sal;
    }
    public int getsal()
    {
        return sal;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public int compareTo(Employeesal esal)
    {
        if(this.sal<esal.sal)
        {
            return 1;
        }
        else if(this.sal>esal.sal)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
public class EmployeedescsalApp 
{
    public static void main(String[] args) 
    {
        ArrayList<Employeesal> al = new ArrayList<Employeesal>();
        Scanner xyz = new Scanner(System.in);
        int eid,sal,i;
        String name;
        Employeesal e[] = new Employeesal[5];
        for(i=0;i<e.length;i++)
        {
            e[i] = new Employeesal();
            System.out.println("Enter the Employee's Id:");
            eid = xyz.nextInt();
            e[i].setid(eid);
            System.out.println("Enter the Name of the Employee:");
            xyz.nextLine();  //Consuming newline Character
            name = xyz.nextLine();
            e[i].setname(name);
            System.out.println("Enter the Salary of the Employee:");
            sal = xyz.nextInt();
            e[i].setsal(sal);
            al.add(e[i]);
            System.out.println("");
        }
        System.out.println("Display Employee Details before Sorting:");
        for(Employeesal esal : al)
        {
            System.out.println(esal.getid() + " " + esal.getname() + " " + esal.getsal());
            System.out.println("");
        }
        Collections.sort(al);
        System.out.println("Employe Data After Sorting in Descending is:");
        for(Employeesal esal : al)
        {
            System.out.println(esal.getid() + " " + esal.getname() + " " + esal.getsal());
            System.out.println("");
        }
        al.remove(1);
        System.out.println("Employee with 2nd Max Salary has been removed Successfully....");
        for(Employeesal esal : al)
        {
            System.out.println(esal.getid() + " " + esal.getname() + " " + esal.getsal());
            System.out.println("");
        }
    }
}
