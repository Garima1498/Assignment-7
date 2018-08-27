class abc
{
abc()
{
this(15);
System.out.println("Default constructor");
}
abc(int a)
{
this(15,20);
System.out.println(a);
}
abc(int x,int y)
{
System.out.println(x+y);
}
public static void main(String args[])
{
new abc(); 
}
}
