/**
 * Program to print the hexadecimal equivalent of a decimal number
 */
import java.util.*;
public class Q10
{
    int dec,rem;
    char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    String hexdec="";
    void input()
    {
        Scanner scan = new Scanner(System.in);		
        System.out.print("Enter Decimal Number : ");
        dec = scan.nextInt();
    }
    
    void calc()
    {	
        while(dec>0)
        {
            rem = dec%16;
            hexdec = hex[rem] + hexdec;
            dec = dec/16;
        }		
        System.out.print("Equivalent Hexadecimal Value : "+hexdec);
    }
    
    public static void main() 
    {
        Q10 obj = new Q10();
        obj.input();
        obj.calc();
    }
}

