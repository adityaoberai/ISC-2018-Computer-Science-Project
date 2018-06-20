/**
 *Program to print a unique-digit number between a certain range
 *A unique-digit number is a number in which no digit is the same
 */
import java.io.*;
public class Q13
{
    String str;
    Q13()
    {
        str="";
    }

    int check(int n)
    {
        str=Integer.toString(n);
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))return 0;
            }
        }
        return 1;
    }

    public static void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n,f=0;
        Q13 obj=new Q13();
        System.out.println("Enter upper and lower limit of range of numbers to be checked:-");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());                
        System.out.println("List Of Unique-Digit Numbers:-");
        for(int i=m;i<=n;i++)
        {
            if(obj.check(i)==1)
            {
                f++;
                System.out.println(i);
            }
        }
        System.out.println("Frequency Of Unique-Digit Numbers = "+f);
    }
}

