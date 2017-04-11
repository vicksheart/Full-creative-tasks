import java.util.*;

class St
{
String s="";
String rev="";
St(String x)
{
s=x;
char ch[] = s.toCharArray();
for(int i=ch.length-1;i>=0;i--)
{
  rev = rev+ch[i];
}
}
public String StringReverse()
{
return rev;
}
}
class Task1
{
public static void main(String ar[])
{
   Scanner in = new Scanner(System.in);
  String s = in.next();
   St obj = new St(s);
   System.out.println(obj.StringReverse());
}
}
