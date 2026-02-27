class parent
{
	void showparent()
	{
		System.out.println("parent");
	}
}
class childone extends parent
{
	void showchildone()
 	{ 
		System.out.println("child one");
	}
}
class childtwo extends parent
{
	void showchildtwo()
	{
		System.out.println("child two");
 	}
}
class HiraricalInheritence
{
 public static void main(String args[])
{
  childone obj=new childone();
childtwo ds=new childtwo();

ds.showchildtwo();
obj.showchildone();
obj.showparent();


}
}
