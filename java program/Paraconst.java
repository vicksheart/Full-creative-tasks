import java.io.*;
import java.util.*;
class Paraconst
{
  static int i;
  static String name;
  static float j;
  static double k;
  Paraconst(int x,String s,float f,double d)
{
  i=x;
  name =s;
j=f;
k=d;
}
   
  public static void main(String ar[])
{
  Paraconst a1 = new Paraconst(5,"Maneesh",4.5f,6.6);
 System.out.println("Integer"+a1.i);
 System.out.println("string"+a1.name);
 System.out.println("flaot"+a1.j);
 System.out.println("double"+a1.k);
}
}

