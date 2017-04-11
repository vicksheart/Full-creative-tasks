abstract class Shape
{
abstract void draw();
}
class Rectangle extends Shape
{
   void draw()
   {
    System.out.println("Drawing rectangle");
   }
}
class Circle extends Shape
{
   void draw()
   {
   System.out.println("Drawing circle");
   }
}
class Task2
{
public static void main(String ar[])
{
  Shape obj = new Circle();
  obj.draw();
  Shape obj1 = new Rectangle();
  obj1.draw();
}
}
