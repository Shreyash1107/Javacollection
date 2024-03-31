package Collections;
import java.util.*;
class Player implements Comparable
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
        this.name = name;
    }
    public String getname()
    {
        return name;
    }
    public int compareTo(Object obj)
    {
        Player p = (Player)obj;
        if(this.runs>p.runs)
        {
            return 1;
        }
        else if(this.runs<p.runs)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
public class PlayerApp 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int i,id,runs;
        Player p[] = new Player[5];
        for(i=0;i<p.length;i++)
        {
            p[i] = new Player();
            System.out.println("Enter the Player's Id:");
            id = sc.nextInt();
            p[i].setid(id);
            System.out.println("Enter the Player's Name:");
            sc.nextLine();    //Consuming newline Character
            String name = sc.next();
            p[i].setname(name);
            System.out.println("Enter the Player's Runs:");
            runs = sc.nextInt();
            p[i].setruns(runs);
            al.add(p[i]);
        }
        System.out.println("Display Data Before Sorting:");
        for(Object obj:al)
        {
            Player player = (Player)obj;
            System.out.println(player.getid() + " " + player.getruns() + "  " + player.getname());
        }
        Collections.sort(al);
        System.out.println("Player Data After Sorting:");
        for(Object obj:al)
        {
            Player player = (Player)obj;
            System.out.println(player.getid() + " " + player.getruns() + "  " + player.getname());
        }
    }
}
