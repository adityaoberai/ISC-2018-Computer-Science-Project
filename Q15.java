/**
 * Program to input a matrix and rotate it clockwise by 90 degrees
 */
import java.io.*;
public class Q15
{
    int arr[][],rotatedarr[][],n,sum;
    Q15(int N)
    {
        n=N;
        arr=new int[n][n];
        rotatedarr=new int[n][n];
        sum=0;
    }

    void input() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter element => ");
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("\n\nOriginal Array:-\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    void rotate()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                rotatedarr[i][j]=arr[n-j-1][i];
            }
        }
        System.out.println("\n\nRotated Array:-\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(rotatedarr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of sides in the matrix => ");
        int a=Integer.parseInt(br.readLine());
        Q15 obj = new Q15(a);
        obj.input();
        obj.rotate();
    }
}



