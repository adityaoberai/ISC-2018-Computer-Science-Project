/**
 * Program to find all permutations of the alphabets of the inputted word
 */
import java.util.*;
public class Q7
{
    static String str;
    void rec(String s1,String s2)
    {
        if(s2.length()<2)
        {
            System.out.println(s1+s2);
        }
        else
        {
            String x,y,z;
            for(int i=0;i<s2.length();i++)
            {
                x=s2.substring(i,i+1);
                y=s2.substring(0,i);
                z=s2.substring(i+1);
                rec(s1+x,y+z);
            }
        }
    }
    public static void main()
    {
        Q7 obj=new Q7();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string : ");
        str=sc.next();
        obj.rec("",str);
    }
}



