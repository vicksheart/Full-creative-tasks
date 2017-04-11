class parant
{
    public void method1()
       {
          System.out.println("This is first parant class");
       }
}
class child
{
     public void method2()
      {
          System.out.println("This is child class");
      }
}
class Inheritance4
{
     public static void main(String ar[])
   {
       child c = new parant();
       p.method1();
       p.method2();
}
}