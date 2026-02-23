class GrandParent
{
	void showGrandParent()
	{
		System.out.println("grand");
	}
}
class Parent extends GrandParent 
{
	void showParent()
	{
		System.out.println("Parent");
	}
}
class Child extends  Parent
{ 
	void showChild()
	{
		System.out.println("Child");
	}
}
class MultilevelInheritenceExample
{
 	public static void main(String args[])
	{
 	Child obj=new Child();
 	obj.showGrandParent();
 	obj.showParent();
	obj.showChild();
	}
}
