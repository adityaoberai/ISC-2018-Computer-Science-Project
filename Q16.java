/**
 * Program to check whether a number is a Smith Number or not
 * A Smith Number is a composite number, the sum of whose digits is the sum of the digits of its prime factors
 */
import java.io.*;
public class Q16
{
    int n=0,sump=0,sumd=0;
    
    void input() throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter number to be checked = ");
        n=Integer.parseInt(br.readLine());
    }
    
    int prime(int a)
    {
        for(int i=2;i<a/2;i++)
        {
            if(a%i==0)return 0;
        }
        return 1;
    }
    
    void calc()
    {
        if(prime(n)==0)
        {
            int p=n,f=2;
            while(p>1 && f<=p)
            {
                if(p%f==0 && prime(f)==1)
                {
                    sump+=f;
                    p/=f;
                }
                else if(p%f!=0 || prime(f)==0)f++;
            }
            int t=n;
            while(t>0)
            {                
                sumd+=t%10;
                t/=10;
            }
            if(sumd==sump)System.out.println("Smith number");
            else System.out.println("Not a Smith number");
        }
        else System.out.println("Not a Smith number");
    }
    
    public static void main() throws IOException
    {
        Q16 obj=new Q16();
        obj.input();
        obj.calc();
    }
}


