import java.util.*;
class Student
{
int age;
String name;
void read()
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the name");
String name=sc.nextLine();
System.out.println("enter the age");
int age=sc.nextInt();
}
void display()
{
	System.out.println("name:"+name);
	System.out.println("age:"+age);
}
public static void main(String args[])
{
	Student S1=new Student();
	S1.read();
	S1.display();
}
}