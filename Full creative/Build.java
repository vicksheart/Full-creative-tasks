import java.lang.String;
import java.io.*;
class Build
{
   public static void main(String args[]) throws IOException
   {
      String word;
      String rev;
      System.out.println("Enter the string that you want to reverse");
      BufferdReader br = new BufferdReader(new InputStreamReader(System.in));
      word = br.ReadLine();
      StringBuffer a = new StringBuffer(word);
      StringBuffer a1 = a.reverse();
       String rev1 = a1.toString();
      System.out.println("reverse is"+rev1);
   }
}
