class parant
{
  public void method1()
     {
        System.out.println("This is parant");
     }
}
class child extends parant
{
  public void method2()
    {
        System.out.println("This is child");
    }
}
class Inheritance2
{
 public static void main(String ar[])
{
 child c = new child();
 c.method1();
 c.method2();
}
}