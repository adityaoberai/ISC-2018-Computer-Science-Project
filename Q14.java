/**
 * Program to input an array, print its border elements and transpose
 */
import java.io.*;
public class Q14
{
    int A[][],n;
    Q14(int n1)
    {
        n=n1;
        A=new int[n][n];
    }

    void input() throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter element => ");
                A[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }

    void border()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==0 || j==n-1) System.out.print(A[i][j]+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    void transpose()
    {
        int T[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                T[i][j]=A[j][i];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(T[i][j]+" ");
            }
            System.out.println();
        }
    }

        public static void main() throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter order of matrix = ");
        int a=Integer.parseInt(br.readLine());
        Q14 obj = new Q14(a);
        obj.input();
        obj.border();
        obj.transpose();
    }
}

