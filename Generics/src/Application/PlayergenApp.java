package Application;
import java.util.*;
class Player
{
    private int id;
    private int runs;
    private String name;
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
public class PlayergenApp 
{
    public static void main(String[] args) 
    {
            Scanner xyz = new Scanner(System.in);
            ArrayList <Player>al = new ArrayList<>();
            int i,pid,runs;
            String name;
            Player p[] = new Player[5];
            for(i=0;i<p.length;i++)
            {
                p[i] = new Player();
                System.out.println("Enter the Id of a Player:");
                pid = xyz.nextInt();
                p[i].setid(pid);
                System.out.println("Enter the Name of a Player:");
                xyz.nextLine();  //Conuming newline Character
                name = xyz.nextLine();
                p[i].setname(name);
                System.out.println("Enter the Runs Score by Player:");
                runs = xyz.nextInt();
                p[i].setruns(runs);
                p[i] = new Player(pid, name, runs);
                al.add(p[i]);
            }
            System.out.println("Display Player Details:");
            for(Player players :al)
            {
                System.out.println(players.getid() + "  " + players.getname() + " " + players.getruns());
            }
            int sum = 0;
            for(Player players : al)
            {
                sum = sum + players.getruns();
            }
            System.out.println("Total Runs Scored by Players are:" + sum);
            float avg;
            avg = sum /p.length;
            System.out.println("Average Runs Score by Player is:" + avg);
    }
}
