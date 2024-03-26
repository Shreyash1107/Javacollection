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
public class VectorPlayerApp 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        int pid,runs;
        String name;
        Player p1 = new Player();
        System.out.println("Enter the Id of a Player:");
        pid = sc.nextInt();
        p1.setid(pid);
        System.out.println("Enter the Name of the Player:");
        sc.nextLine();   //Ci=onsuming Newline Character
        name = sc.nextLine();
        p1.setname(name);
        System.out.println("Enter the Runs of a Player:");
        runs = sc.nextInt();
        p1.setruns(runs); 
        Player p2 = new Player();
        System.out.println("Enter the Player's Id:");
        pid = sc.nextInt();
        p2.setid(pid);
        System.out.println("Enter the Player's Id:");
        
    }
}
