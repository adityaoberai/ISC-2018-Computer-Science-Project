/**
 * Program to print coprime numbers before the inputted number
 * Coprime numbers are those numbers from 1 to the number inputted which are not divisible by the inputted number's linear factors
 * Linear factors are the first 2 consecutive factors of the inputted number
 */
import java.io.*;
public class Q2
{
    int count,sum,n1,n2;
    Q2()
    {
        count=0;
        sum=0;
    }

    void linearfactors(int n)
    {
        n1=n2=-1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0 && n%(i+1)==0)
            {
                n1=i;
                n2=i+1;
                break;
            }
            else if(n%i==0 && n%(i+2)==0)
            {
                n1=i;
                n2=i+2;
                break;
            }
        }
    }

    void coprime(int n)
    {        
        if(n1==-1)return;
        System.out.println(n+":-\n\nLinear factors of n = "+n1+","+n2+"\n");
        for(int i=1;i<n;i++)
        {
            if(i%n1!=0 && i%n2!=0)
            {
                count++;
                sum+=i;
                System.out.println(i);
            }            
        }
        System.out.println("\nSum of coprime numbers = "+sum+"\nCount of coprime numbers = "+count+"\n\n\n");
    }

    public static void main() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        Q2 obj=new Q2();
        System.out.print("Enter number = ");
        int i=Integer.parseInt(br.readLine());
        obj.linearfactors(i);
        obj.coprime(i);
    }    
}
