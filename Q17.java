/**
 * Program to find the sum of the elements of the main diagonal of a square matrix
 */
import java.io.*;
class Q17
{
    int Arr[][], r, c, sum;
    Q17(int a)
    {
        r=a;
        c=a;
        sum=0;
        Arr=new int [r][c];
    }
    
    void input() throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("\fEnter no. = ");
                Arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }
    
    void Sum()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)sum+=Arr[i][j];
            }
        }
    }
    
    void display()
    {
        System.out.print("\f");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nSum of main diagonal = "+sum);
    }
    
    public static void main() throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\fEnter no. of rows and columns = ");
        int n=Integer.parseInt(br.readLine());
        Q17 obj = new Q17(n);
        obj.input();
        obj.Sum();
        obj.display();
    }
}


