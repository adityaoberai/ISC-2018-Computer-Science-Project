/**
 * Program to check whether a number is a Rotational Prime or not
 */
import java.io.*;
class Q4
{
    static int n;
    Q4()
    {
        n=0;
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
    
    void check()
    {
        String str=Integer.toString(n);int t=n;int flag=0;System.out.println(str);
        do
        {
            if(prime(t)==0)
            {
                flag++;
                break;
            }
            str=str.charAt(str.length()-1)+str.substring(0,str.length()-1);
            t=Integer.parseInt(str);
        }
        while (t!=n);
        if (flag==0)System.out.println("Rotational Prime");
        else System.out.println("Not A Rotational Prime");
    }
    
    public static void main() throws IOException
    {
        Q4 obj=new Q4();
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter number = ");
        n=Integer.parseInt(br.readLine());
        obj.check();
    }
}