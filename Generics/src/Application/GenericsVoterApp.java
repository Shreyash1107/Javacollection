package Application;

import java.time.LocalDate;

class Voter 
{
    private int id;
    private String name;
    private String date;
    public Voter()
    {

    }
    public Voter(int id,String name,String date)
    {
        this.id = id;
        this.name = name;
        this.date = date;
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
    public void setdate(String date)
    {
        this.date = date;
    }
    public String getdate()
    {
        return date;
    }
    public int getage()
    {
        String parts[] = date.split("-");
        int birthyear,birthmonth,birthday;
        birthyear = Integer.parseInt(parts[0]);
        birthmonth = Integer.parseInt(parts[1]);
        birthday = Integer.parseInt(parts[2]);

        LocalDate cndate = LocalDate.now();
        
    }
}
public class GenericsVoterApp 
{
    public static void main(String[] args) 
    {

    }
}
