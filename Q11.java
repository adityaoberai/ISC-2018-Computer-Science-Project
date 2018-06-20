/**
 * Program to find the Saddle Point of a square matrix
 * A Saddle Point is a position in a matrix at which the number present is the smallest in its row and the largest in its column
 */
import java.io.*;
class Q11
{
    int n=0, A[][];
    void input() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the order of the matrix : ");
        n=Integer.parseInt(br.readLine());
        A=new int[n][n];
        System.out.println("Inputting the elements in the matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter Element at ["+i+"]["+j+"] : ");
                A[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("\nOriginal Matrix:-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void check()
    {
        int max, min, x, f=0;
        for(int i=0;i<n;i++)
        {
            min = A[i][0];
            x = 0;
            for(int j=0;j<n;j++)
            {
                if(A[i][j]<min)
                {
                    min = A[i][j]; x = j;
                }
            }
            max = A[0][x];
            for(int k=0;k<n;k++)
            {
                if(A[k][x]>max)
                {
                    max = A[k][x];
                }
            }
            if(max==min)
            {
                System.out.println("\nSaddle point = "+max);
                f++;
            }
        }
        if(f==0)
        {
            System.out.println("\nNo saddle point");
        }
    }
    public static void main()throws IOException
    {  
        Q11 obj=new Q11();
        obj.input(); obj.check();
    }
}