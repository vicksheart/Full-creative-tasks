class parant
{
   public void method1()
       {
           System.out.println("Hello iam parant class method");
       }
 }
class child extends parant
 {
     public void method2()
       {
         System.out.println("Hello this is child method");
       }
}
class Inheritance
{
   public static void main(String ar[])
{
   parant p = new parant();
   p.method1();
   p.method2();
}
}