/**
 * Program to sort an array using insertion sort technique
 */
import java.io.*;
public class Q20
{
    int N[],sz;
    Q20(int sz1)
    {
        N=new int[sz1];
        sz=sz1;
    }
    
    void Input() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<sz; i++)
        {
            System.out.print("Enter value => ");
            N[i]=Integer.parseInt(br.readLine());
        }
    }
    
    void Sort()
    {
        for(int i=1;i<sz;i++)
        {
            int j=i;
            while(j>0 && N[j]<N[j-1])
            {
                int t=N[j];
                N[j]=N[j-1];
                N[j-1]=t;
                j--;
            }
        }
    }
    
    void Display()
    {
        for(int i=0;i<sz;i++)
        {
            System.out.print(N[i]+" ");
        }
    }
    
    public static void main() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of array => ");
        int n = Integer.parseInt(br.readLine());
        Q20 obj = new Q20(n);
        obj.Input();
        obj.Sort();
        obj.Display();
    }
}