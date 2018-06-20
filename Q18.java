/**
 * Program to print the following pattern:-
 * 
 *     #   @   @   @   #   
 *     !   #   @   #   !   
 *     !   !   #   !   !   
 *     !   #   @   #   !   
 *     #   @   @   @   #   
 * 
 * For any number of rows
 */
import java.io.*;
public class Q18
{
    char Arr[][];int r, c;
    Q18(int a)
    {
        r=a;
        c=a;
        Arr=new char [r][c];
    }

    void fill()
    {
        for (int i = 0; i<r; i++)
        {
            Arr[i][i] = Arr[i][r-i-1] = '#';
            for (int j = 0; j<c; j++)
            {
                if ((j>i && j<c-i-1) || (j<i && j>c-i-1)) Arr[i][j] = '@';
                else if (i!=j && i!=r-j-1)Arr[i][j] = '!';
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter number of rows or columns=> ");
        int n = Integer.parseInt (br.readLine());
        Q18 obj = new Q18(n);
        obj.fill();
    }
}