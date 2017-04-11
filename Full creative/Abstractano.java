abstract class mentor
{
public void sum()
{
  System.out.println("my name is manish tiwari");
}
 abstract public void marks();
 void Man()
 {
   System.out.println("Here is my solution mr amandeep");
 }
}
class manish  extends mentor
{
  public void sum()
  {
    System.out.println("Is it right??");
  }

  public void marks()
  {
    System.out.println("Yaa it is good");
  }
}
class Abstractano
{
public static void main(String ar[])
{
   mentor obj1 = new manish();
  obj1.sum();

}
}
