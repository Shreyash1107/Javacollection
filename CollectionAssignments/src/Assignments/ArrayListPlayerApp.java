package Assignments;
import java.util.*;
class Player
{
    private int id;
    private String name;
    private int runs;
    public Player()
    {

    }
    public Player(int id,String name,int runs)
    {
        this.id = id;
        this.name = name;
        this.runs = runs;
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
    public void setruns(int runs)
    {
        this.runs = runs;
    }
    public int getruns()
    {
        return runs;
    }
}
public class ArrayListPlayerApp 
{
    public static void main(String[] args) 
    {
        ArrayList <Player> al = new ArrayList<Player>();
        Scanner xyz = new Scanner(System.in);
        int pid,runs,i;
        String name;
        Player p[] = new Player[5];
        for(i=0;i<p.length;i++)
        {
            p[i] = new Player();
            System.out.println("Enter the Player's ID:");
            pid = xyz.nextInt();
            p[i].setid(pid);
            System.out.println("Enter the Player's Name:");
            xyz.nextLine();  //Consuming Newline Character
            name = xyz.nextLine();
            p[i].setname(name);
            System.out.println("Enter the Runs Scored by Player:");
            runs = xyz.nextInt();
            p[i].setruns(runs);
            al.add(p[i]);
            System.out.println("");
        }
        System.out.println("Display Player Data :");
        for(Player players : al)
        {
            System.out.println(players.getid() + " " + players.getname() + " " + players.getruns());
        }
        int flag=-1,id;
        System.out.println("Enter the Player Id to Search for:");
        id = xyz.nextInt();
        for(Player players : al)
        {
            if(id == players.getid())
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Player with Id " + id + " is Present.....");
            for(Player players:al)
            {
               if(id == players.getid())
               {
                    System.out.println(players.getid() + " " + players.getname() + " " + players.getruns());
               }
            }
        }
        else
        {
            System.out.println("Player with id " + id + " is not Present....");
        }
    }
}
