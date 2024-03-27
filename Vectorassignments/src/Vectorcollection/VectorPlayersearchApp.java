package Vectorcollection;
import java.util.*;
class Player
{
    private int id;
    private int runs;
    private String name;
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
    public void setruns(int runs)
    {
        this.runs = runs;
    }
    public int getruns()
    {
        return runs;
    }
}
public class VectorPlayersearchApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        Player p[] = new Player[5];
        int i;
        int pid,runs;
        String name;
        for(i=0;i<p.length;i++)
        {
            p[i] = new Player();
            System.out.println("Enter the Player's Id:");
            pid = sc.nextInt();
            p[i].setid(pid);
            System.out.println("Enter the Runs of a Player:");
            runs = sc.nextInt();
            p[i].setruns(runs);
            System.out.println("Enter the Name of the Player:");
            sc.nextLine(); //Consuming Newline Character
            name = sc.nextLine();
            p[i].setname(name);
            v.add(p[i]);
        }
        System.out.println("Display Player Data:");
        for(Object obj:v)
        {
            Player players = (Player) obj;
            System.out.println(players.getid() + " " + players.getruns() + " " + players.getname());
        }
        int id,flag=0;
        System.out.println("Enter the Id to serach for:");
        id = sc.nextInt();
        for(Object obj:v)
        {
            Player players = (Player)obj;
            if(players.getid()==id)
            {
               flag=1;
               break;
            }
        }
        if(flag==1)
        {
            System.out.println("Player with Id " + id + " is present in Vector....");
        }
        else
        {
            System.out.println("Player with Id " + id + " is not present in Vector....");
        }
    }
}
