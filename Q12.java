/**
 * Program to print palindromic words and count of palindromic word in a sentence
 */ 
import java.io.*;
import java.util.*;
class Q12
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str, s;
    StringTokenizer st;
    int i;
    Q12()
    {
        i=0;
        s="";
        str="";
    }
    
    boolean palin(String s1)
    {
        int j,l;
        l=s1.length();
        for(j=0;j<l/2;j++)
        {
            if(s1.charAt(j)!=s1.charAt(l-j-1))break;
        }
        if(j<l/2)
            return false;
        else
        {
            i++;
            return true;
        }
    }
    
    void show()throws Exception
    {
        System.out.print("Enter the sentence: ");
        str=br.readLine();
        str=str.toUpperCase();
        st=new StringTokenizer(str," .,?!");
        while(st.hasMoreTokens())
        {
            s=st.nextToken();
            if(palin(s)==true)
                System.out.print(" "+s);
        }
        if(i==0)
            System.out.println("\n\nNo palindromic words");
        else
            System.out.println("\n\nNumber of palindromic words :"+i);
    }

    public static void main() throws Exception
    {
        Q12 obj=new Q12();
        obj.show();
    }
}




