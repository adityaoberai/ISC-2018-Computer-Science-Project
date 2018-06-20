/**
 * Program to encrypt a plain textIf using Caesar Cipher
 * Caesar Cipher is an encryption technique where the alphabets are rotated by 13 places
 */
import java.io.*;
public class Q9
{
    String str,cipher;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Q9()
    {
        str="";
        cipher="";
    }
    
    void input() throws IOException
    {
        System.out.print("Enter string : ");
        str=br.readLine();
    }
    
    void encrypt()
    {
        for(int i=0;i<str.length();i++)
        {
            char w=str.charAt(i);
            if((w>64 && w<78) || (w>96 && w<110))w+=13;
            else if((w>77 && w<91) || (w>109 && w<123))w-=13;
            cipher+=w;
        }
        System.out.println(cipher);
    }
    
    public static void main() throws IOException
    {
        Q9 obj=new Q9();
        obj.input();
        obj.encrypt();
    }
}
