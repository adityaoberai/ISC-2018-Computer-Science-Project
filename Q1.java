/**
 * 
 * Program to check whether a number is a Reversible Prime or not
 * A number is a Reversible Prime if the number and its reverse are prime numbers
 */
import java.io.*;
public class Q1
{
    int n,rev;
    Q1()
    {
        n=rev=0;
    }

    void input()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Number to be checked = ");
        n=Integer.parseInt(br.readLine());
        int t=n;
        while(t>0)
        {
            int d=t%10;
            t/=10;
            rev=rev*10+d;
        }
    }

    int prime(int a)
    {
        int c=0;
        for(int i=1;i<=a;i++) 
        {
            if(a%i==0)c++;
        } 
        if(c==2)return 1;
        else return 0;
    }

    void revprime()
    {
        System.out.println("ORIGINAL NUMBER = "+n+"\nREVERSE NUMBER = "+rev);
        if(prime(n)==1 && prime(rev)==1) System.out.println("REVESIBLE PRIME\n");
        else System.out.println("NOT A REVESIBLE PRIME\n");
    }

    public static void main() throws IOException
    {
        Q1 obj=new Q1();
        obj.input();
        obj.revprime();
    }
}