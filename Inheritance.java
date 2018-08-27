class X
{
public void and()
{
System.out.println("enter in class A");
}
}
class Y extends X
{
public void and()
{
super.and();
System.out.println("enter in class B");
}
}
class Instance_method
{
public static void main(String args[])
{
Y b=new Y();
b.and();
System.out.println("called without using an object");
}
}
