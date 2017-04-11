abstract class mentor
{
 abstract int marks();
}
class manish  extends mentor
{
  int marks()
  {
    return 50;
  }
}
class amandeep extends mentor
{
        int marks()
        {
          return 60;
        }
}
class Task3
{
public static void main(String ar[])
{
  mentor obj1 = new manish();
  System.out.println("marks of manish is"+obj1.marks());
  mentor obj2 = new amandeep();
System.out.println("marks of amandeep is"+obj1.marks());
}
}
