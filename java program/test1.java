import java.io.*;
import java.util.*;
public class Test1
{
  public static void main(String ar[])
{
   Scanner in = new Scanner(System.in);
   string str = in.next();
   int sum=0;
   char c[]=str.toCharArray();
   for(int i=0;i<str.length();i++)
{
   Charactar ch = new Charactar(c[i]);
   String s = ch.toString();
   int n = Integer.parseInt(s);
   sum  =sum+n*n*n;
   }
Integer ii = new Integer(sum);
String sres = ii.toString();
if(str.equals(sres))
{
  System.out.println("Nubmber is armstrong number");
}
else
{
  System.out.println("Number is not armstrong number");
}
}
}
    