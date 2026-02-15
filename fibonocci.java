import java.util.*;
class fibonocci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the fibonocci");
int n=sc.nextInt();
int a=1;
int b=1;
System.out.println("the fibonocci series:");
for(int i=1;i<=n;i++)
{
System.out.println(a+" ");
int c=a+b;
a=b;
b=c;
}
}
}