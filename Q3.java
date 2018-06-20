/**
 * Program to print the day on the 13th of every month in a year if year and day on the 1st of January are given
 */
import java.io.*;
class Q3
{
    int noOfDays[]={31,28,31,30,31,30,31,31,30,31,30,31};
    static String Day[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    String Month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int year;
    Q3()
    {
        year=2018;
    }
    
    void prog(int d)
    {
        int y=365; 
        int dayOfMonth=1;
        int dayOfWeek=d;
        int month=0;
        if (year%100!=0 && year%4==0) {noOfDays[1]++;y++;}
        else if (y%400==0){noOfDays[1]++;y++;}
        System.out.println("Month\t\tThirteenth");
        for(int i=1;i<=y; i++)
        {
            if (month==12)break;
            dayOfMonth++;
            dayOfWeek++;
            if(Day.length==dayOfWeek)
            {
                dayOfWeek=0;
            }
            if (dayOfMonth>noOfDays[month])
            {
                month++;
                dayOfMonth=1;
            }
            if(dayOfMonth==13)
            {
                System.out.println(Month[month]+"\t\t"+Day[dayOfWeek]);
            }
        }
    }
    
    public static void main() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter year = ");
        year = Integer.parseInt (br.readLine());
        System.out.print("Enter day on 1st Jan = ");
        String d = br.readLine();
        int D=0;
        for(int i=0;i<=6;i++)
        {
            if(Day[i].equalsIgnoreCase(d))D=i;
        }
        Q3 obj = new Q3();
        obj.prog(D);
    }
}