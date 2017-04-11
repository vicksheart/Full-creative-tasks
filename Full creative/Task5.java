abstract class Mentor
{
   Mentor()
   {
   System.out.println("Here is my subject list");
   }
   abstract void details();
   void changesub()
   {
    System.out.println("subject is changed");
   }
}
class manish extends Mentor
{
  void details()
  {
    System.out.println("Now he is with new subject");
  }
}
class Task5
{
public static void main(String ar[])
{
Mentor obj = new manish();
obj.details();
obj.changesub();
}
}
