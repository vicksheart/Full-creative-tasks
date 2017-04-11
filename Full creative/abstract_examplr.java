abstract class mentor
{
public void sum()
{
  System.out.println("my name is manish tiwari");
}
 abstract void marks();
 void Man()
 {
   System.out.println("Here is my solution mr amandeep");
 }
}
class manish  extends mentor
{
  void marks()
  {
    System.out.println("Is it right??");
  }
}
class abstract_examplr
{
public static void main(String ar[])
{
   mentor obj1 = new manish();
  obj1.sum();
  obj1.marks();
  obj1.Man();
}
}
