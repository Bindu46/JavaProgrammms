class Parent
{
  	void showparent()
	{

  	System.out.println("parent");
	}
}
class child extends Parent
{
  	void showchild()
	{
	System.out.println("child");
	}
}
class SingleInheritenceExample
{


  public static void main (String args[])
    {
        child obj=new child();
        obj.showparent();
	obj.showchild();
   }
}









