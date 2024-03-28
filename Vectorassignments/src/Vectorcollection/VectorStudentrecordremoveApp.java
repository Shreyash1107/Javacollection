package Vectorcollection;
import java.util.*;
class Student
{
    private int id;
    private String name;
    private float Per;
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
    public void setper(float Per)
    {
        this.Per = Per;
    }
    public float getper()
    {
        return Per;
    }
}
public class VectorStudentrecordremoveApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        Vector v = new Vector();   
        Student stud[] = new Student[5];
        int i;
        int id;
        String name;
        float Per;
        for(i=0;i<stud.length;i++)
        {
            stud[i] = new Student();
            System.out.println("Enter the Student's Id:");
            id =  xyz.nextInt();
            stud[i].setid(id);
            System.out.println("Enter ths Student's Name:");
            xyz.nextLine();  //Consuming newline Character
            name = xyz.nextLine();
            stud[i].setname(name);
            System.out.println("Enter the Student's Percentage:");
            Per = xyz.nextFloat();
            stud[i].setper(Per);
            v.add(stud[i]);
        } 
        System.out.println("Display Student's Data:");
        for(Object obj:v)
        {
            Student students = (Student)obj;
            System.out.println(students.getid() + " " + students.getname() + " " + students.getper());
        }
        int flag=0,sid;
        System.out.println("Enter the Student's Id to search for:");
        sid = xyz.nextInt();
        for(i=0;i<v.size();i++)
        {
            Student students = (Student)v.get(i);
            if(students.getid()==sid)
            {
                v.remove(i);
                flag = 1;
                i--;
            }
        }
        if(flag==1)
        {
            System.out.println("Student with id " + sid + " is successfully removed");
        }
        else
        {
            System.out.println("Student with " + sid + " not found");
        }
        System.out.println("Updated Student Data is:");
        for(Object obj:v)
        {
            Student students = (Student)obj;
            System.out.println(students.getid() + " " + students.getname() + " " + students.getper());
        }
    }
}
