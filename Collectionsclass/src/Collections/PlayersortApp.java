package Collections;
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
    public void setruns(int runs)
    {
        this.runs = runs;
    }
    public int getruns()
    {
        return runs;
    }
    public void setname (String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }
}
public class PlayersortApp 
{
    public static void main(String[] args) 
    {
        Scanner xyz = new Scanner(System.in);
        int choice;
        Vector v = new Vector();
        Player p[] = new Player[3];
        do
        {
            System.out.println("1.Sort Player by Id.");
            System.out.println("2.Sort Player by Runs.");
            System.out.println("Enter yuor Choice:");
            choice = xyz.nextInt();
            switch(choice)
            {
                case 1:
                    int i,id,runs;
                    String name;
                    for(i=0;i<p.length;i++)
                    {
                        p[i] = new Player();
                        System.out.println("Enter the Id of a Player:");
                        id = xyz.nextInt();
                        p[i].setid(id);
                        System.out.println("Enter the Runs Scored by Player:");
                        runs = xyz.nextInt();
                        p[i].setruns(runs);
                        System.out.println("Enter the Name of a Player:");
                        xyz.nextLine();   //Consuming newline Character
                        name = xyz.nextLine();
                        p[i].setname(name);
                        v.add(p[i]);
                    }
                    System.out.println("Display Player Data before Sorting:");
                    for(Object obj:v)
                    {
                        Player p1 = (Player)obj;
                        System.out.println(p1.getid() + " " + p1.getname() + " " + p1.getruns());
                    }
                    SortPlayerbyId spid = new SortPlayerbyId();
                    Collections.sort(v, spid);
                    System.out.println("Display Player data After Sorting:");
                    for(Object obj:v)
                    {
                        Player p1 = (Player)obj;
                        System.out.println(p1.getid() + " " + p1.getname() + " " + p1.getruns());
                    }
                    break;
                        case 2:
                        System.out.println("Display Player info Before Sorting:");
                        for(Object obj:v)
                        {
                            Player p2 = (Player)obj;
                            System.out.println(p2.getid() + " " + p2.getruns() + " " + p2.getname());
                        }
                        Sortplayerbyruns sprun = new Sortplayerbyruns();
                        Collections.sort(v,sprun);
                        System.out.println("Display Data after Sorting:");
                        for(Object obj:v)
                        {
                            Player p2 = (Player)obj;
                            System.out.println(p2.getid() + " " + p2.getruns() + " " + p2.getname());
                        }
                        break;
                            default:
                            System.out.println("Exit");
                            break;
            }
        }   while(choice!=3);
    }
}
