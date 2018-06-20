/**
 * Program to find the sum of two distances inputted using objects
 */
import java.io.*;
class Q19
{
    int mtr, cm;
    Q19()
    {
        mtr=0;
        cm=0;
    }

    void read() throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter Meter and Centimeter");
        mtr=Integer.parseInt(br.readLine());
        cm=Integer.parseInt(br.readLine());
    }
    
    static Q19 Add(Q19 A, Q19 B)
    {
        Q19 C=new Q19();
        C.mtr=A.mtr+B.mtr;
        C.cm=A.cm+B.cm;
        if(C.cm>100)
        {
            C.cm-=100;
            C.mtr++;
        }
        return C;
    }

    void display()
    {
        System.out.print("\nMeter = "+mtr+"\tCentemeter = "+cm);
    }

    public static void main() throws IOException
    { 
        Q19 X=new Q19();
        Q19 Y=new Q19();
        X.read();Y.read();
        X.display();Y.display();
        Q19 Z=new Q19();
        System.out.print("\n\nAddition of two distances");
        Z=Z.Add(X, Y);
        Z.display();
    }
}