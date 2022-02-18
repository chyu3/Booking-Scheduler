import java.util.Scanner;

public class Time
{
    private int hours;
    private int minutes;

    public Time()
    {   this.hours = 0;
        this.minutes = 0;
    }
    
    public Time(int m)
    {   this.hours = 0;
        this.setMinutes(m);
    }
    
    public Time(int h, int m)
    {   this.setHours(h);
        this.setMinutes(m);
    }

    public Time(String time)
    {
        int h = 0, m = 0;
        time = time.replace(':', ' ');
        Scanner scanner = new Scanner(time);
        try
        {
            //convert everything to positive
            h = Math.abs( scanner.nextInt());
            m = Math.abs(scanner.nextInt());
            scanner.close();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        if (h > 23 || m > 59)
        {
            //throw new Exception
            System.out.println("Invalid date");
        }
    }

    public int getHours()
    {   return this.hours;
    }

    public void setHours(int h)
    {   if ( h < 0 )
        {   h = h * -1;
        }
        if(h > 23)
        {   h = h % 24;
        }
        this.hours = h;
    }

    public int getMinutes()
    {   return this.minutes;
    }

    public void setMinutes(int m)
    {   int h = hours;
        if ( m < 0 )
        {   m = m * -1;
        }
        if(m > 59)
        {   h = h + m/60;
            m = m % 60;
        }
        this.minutes = m;
        this.setHours(h);
    }
    
    public int toMinutes()
    {   return this.getHours()*60 + this.getMinutes();
    }

    public String toString()
    {   String output ="";
        if(this.getHours() < 10)
        {   output = output + "0";
        }
        output = output + this.getHours() + ":";
        if(this.getMinutes() < 10)
        {   output = output + "0";
        }
        output = output + this.getMinutes();
        return output;
    }
    
    public int diff(Time another)
    {   int t1 = this.toMinutes();
        int t2 = another.toMinutes();
        int difference = t2 - t1;
        if( t1 > t2 )
        {   difference = (t2+24*60) - t1;
        }
        return difference;
    }

    public Time add(Time another)
    {   int totalMinutes = this.toMinutes() + another.toMinutes();
        Time result;
        result = new Time(totalMinutes);
        return result;
    }
    
    public boolean equals(Time another)
    {   boolean result;
        result = this.toMinutes() == another.toMinutes();
        return result;
    }
    
    public int compareTo(Time another)
    {   return this.toMinutes() - another.toMinutes();
    }    

   
}