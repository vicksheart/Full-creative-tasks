import java.io.*;
import java.util.*;
public class Dupl
{
public static void main(String ar[])
{
Scanner in = new Scanner(System.in); 
int i,j;
String str = in.next();
char ch[]=str.toCharArray();
boolean b[] = new boolean[str.length()];
for(i=0;i<str.length();i++)
{
  int count = 1;
  if (b[i]==false)
   {
      for(j=i+1;j<str.length();j++)
         {
             if(ch[i]==ch[j])
                {
                  b[i]=true;
                  b[j]=true;
                  count++;
                }
        }
if(count>1)
{
 System.out.println(ch[i]);
}
}
}
}

  