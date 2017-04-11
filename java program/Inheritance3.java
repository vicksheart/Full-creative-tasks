class parant
{
     public void method1()
        {
           System.out.println("hello iam a parant");
        }
}
class child 
{
     public void method2()
       {
          System.out.println("hello this is child");
       }
}
class Inheritance3
{
  public static void main(String ar[])
{
  parant p = new child();
  p.method1();
  p.method2();
}
}