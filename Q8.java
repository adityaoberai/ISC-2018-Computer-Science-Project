/**
 * Program to check whether a number is an Odious number or not
 * An Odious number is decimal number whose binary equivalent consists of an odd number of 1's.
 */
import java.io.*;
public class Q8
{
    int n,c; long binary;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Q8()
    {
        n=0;
        binary=0;
        c=0;
    }
    
    void input() throws IOException
    {
        System.out.print("ENTER NUMBER = ");
        n=Integer.parseInt(br.readLine());
        if(n<0)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
    }
    
    void convert()
    {
        int t=n;
        while(t>0)
        {
            int d=t%2;
            t/=2;
            if(d==1)c++;
            binary=binary*10+d;
        }
        System.out.println("BINARY EQUIVALENT = "+binary);
    }
    
    void display()
    {
        System.out.println("NUMBER OF 1'S = "+c);
        if(c%2!=0)System.out.println(n+" IS AN ODIOUS NUMBER");
        else System.out.println(n+" IS NOT AN ODIOUS NUMBER");
    }
    
    public static void main() throws IOException
    {
        Q8 obj=new Q8();
        obj.input();
        obj.convert();
        obj.display();
    }
}