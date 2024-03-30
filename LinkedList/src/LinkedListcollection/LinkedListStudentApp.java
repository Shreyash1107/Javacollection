package LinkedListcollection;
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
    public void setPer(float Per)
    {
        this.Per = Per;
    }
    public float getPer()
    {
        return Per;
    }
}
public class LinkedListStudentApp 
{
    public static void main(String[] args) 
    {
            Scanner xyz = new Scanner(System.in);
            LinkedList lst = new LinkedList();
            int i,id;
            String name;
            float Per;
            Student s[] = new Student[3];
            for(i=0;i<s.length;i++)
            {
                s[i] = new Student();
                System.out.println("Enter the Student's Id:");
                id = xyz.nextInt();
                s[i].setid(id);
                System.out.println("Enter the Student's Name:");
                xyz.nextLine();  //Consuming Newline Character
                name = xyz.nextLine();
                s[i].setname(name);
                System.out.println("Enter the Student's Percentage:");
                Per = xyz.nextFloat();
                s[i].setPer(Per);
                lst.add(s[i]);
            }
            System.out.println("Display Student Information:");
            for(Object obj:lst)
            {
                Student stud = (Student)obj;
                System.out.println(stud.getid() + "  " + stud.getname() +  "  " +stud.getPer());
            }
            float maxper;
            maxper = (float)((Student) lst.get(0)).getPer();
            System.out.println("Topper of Class is:");
            for(Object obj:lst)
            {
                Student stud = (Student)obj;
                if(stud.getPer()>maxper)
                {
                    maxper = stud.getPer();
                    // System.out.println(stud.getid() + " " + stud.getname() + " " + stud.getname());
                    System.out.println(stud.getname());
                }
            }
            // System.out.println("Maximum Percentage are:" + maxper);
    }
}
