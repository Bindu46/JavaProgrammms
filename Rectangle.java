import java.util.*;
class Rectangle
{
  float l,b;
void read()
{
Scanner Sc =new Scanner(System.in);
System.out.println("enter the length value");
  l=Sc.nextFloat();
System.out.println("enter the width value");
 b =Sc.nextFloat();
}
Float area()
{
	return l*b;
}
Float perimeter()
{
	return 2*(l+b);
}
public static void main(String args[])
{
Rectangle r1 = new Rectangle();
r1.read();
System.out.println("area of the rectangle:"+r1.area());
System.out.println("perimeter of the ractangle:"+r1.perimeter());
}
}