abstract class Bike
{
abstract void run();
}
class Honda4 extends Bike
{
void run()
{
System.out.println("Running safel");
}
public static void main(String ar[])
{
   Bike obj = new Honda4();
  obj.run();
}
}
