/**
 * Program to print the row number and the sum of the members of the row that has the highest sum in a 2d array
 */
import java.io.*;
public class Q5
{
    int arr[][],highestsum[],rownum[],r,c;
    Q5(int r1,int c1)
    {
        r=r1;
        c=c1;
        arr=new int[r][c];
        highestsum=new int[r];
        rownum=new int [r];
    }

    void input() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<r;i++)
        {
            int sum=0;
            for(int j=0;j<c;j++)
            {               
                System.out.print("Enter number = ");
                arr[i][j]=Integer.parseInt(br.readLine());
                sum+=arr[i][j];
            }
            rownum[i]=i+1;
            highestsum[i]=sum;
        }
    }

    void check()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r-i-1;j++)
            {
                if(highestsum[j]>highestsum[j+1])
                {
                    int t1=highestsum[j];
                    highestsum[j]=highestsum[j+1];
                    highestsum[j+1]=t1;
                    
                    int t2=rownum[j];
                    rownum[j]=rownum[j+1];
                    rownum[j+1]=t2;
                }
            }
        }
    }
    
    void display()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nHighest sum = "+highestsum[r-1]+"\nRow number = "+rownum[r-1]);
    }
    
    public static void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of rows and columns:-");
        int r1=Integer.parseInt(br.readLine());
        int c1=Integer.parseInt(br.readLine());
        Q5 obj=new Q5(r1,c1);
        obj.input();
        obj.check();
        obj.display();
    }
}