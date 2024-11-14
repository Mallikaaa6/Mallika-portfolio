

public class Shape
{
  System.out.println("This is shape class");
}
 public class Rectangle extending Shape
{
  System.out.println("This is Rectangular Shape");
}
public class Circle extending Shape
{
  System.out.println("This is circular Shape");
}

public class Square extending Rectangle
{
  Super();
  System.out.println("Square is a Rectangle");
}
public class void main(String[] args)
{
  Square s1 = new Square();
}