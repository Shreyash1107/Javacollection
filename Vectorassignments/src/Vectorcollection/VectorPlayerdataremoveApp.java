package Vectorcollection;
import java.util.*;
class Player
{
    private int id;
    private String name;
    private int runs;
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
public class VectorPlayerdataremoveApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
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
            System.out.println("Enter the Name of the Player:");
            sc.nextLine();  //Consuming Newline Character
            name = sc.nextLine();
            p[i].setname(name);
            System.out.println("Enter the Runs Scored by Player:");
            runs = sc.nextInt();
            p[i].setruns(runs);
            v.add(p[i]);
        }
        System.out.println("Display Player Data:");
        for(Object obj:v)
        {
            Player player = (Player)obj;
            System.out.println(player.getid() + " " + player.getname() + " " + player.getruns());
        }
        int flag=0,id;
        System.out.println("Enter the Player Id to remove:");
        id = sc.nextInt();
        for(i=0;i<v.size();i++)
        {
            Player player = (Player)v.get(i);
            if(player.getid()==id)
            {
                v.remove(i);
                flag=1;
                i--;
            }
        }
        if(flag==1)
        {
            System.out.println("Player with id " + id + " is removed Successfully");
        }
        else
        {
            System.out.println("Player with id " + id + " is not present so not removed");
        }
        System.out.println("Updated Player Data is:");
        for(Object obj:v)
        {
            Player player = (Player)obj;
            System.out.println(player.getid() + " " + player.getname() + " " + player.getruns());
        }
    }
}
