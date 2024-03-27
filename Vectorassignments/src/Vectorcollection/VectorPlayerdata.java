package Vectorcollection;
import java.util.*;
class Player
{
    private int id;
    private int runs;
    private String name;

    public void setid(int id)
    {
        this.id=id;
    }
    public int getid()
    {
        return id;
    }
    public void setruns(int runs)
    {
        this.runs = runs;
    }
    public int getruns()
    {
        return runs;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
}
public class VectorPlayerdata 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        Player p[] = new Player[3];
        int i;
        int pid,runs;
        String name;
        for(i=0;i<p.length;i++)
        {
            p[i] = new Player();
            System.out.println("Enter the Player's Id:");
            pid = sc.nextInt();
            p[i].setid(pid);
            System.out.println("Enter the Name of a Player:");
            sc.nextLine();
            name = sc.nextLine();
            p[i].setname(name);
            System.out.println("Enter the Runs Score by Player:");
            runs = sc.nextInt();
            p[i].setruns(runs);
            v.add(p[i]);
        }
        System.out.println("Display Player Info:");
        for(Object obj:v)
        {
            Player P = (Player)obj;
            System.out.println(P.getid() + " " + P.getname() + " " + P.getruns());
        }
    }
}
