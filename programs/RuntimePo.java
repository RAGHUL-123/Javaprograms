public class RuntimePo
{
public static void main(String args[])
{
Base b1 = new Derived1();
b1.display();
b1 = new Derived2();
b1.display();
}
}

class Base
{
public void display()
{System.out.println("Base");}
}

class Derived1 extends Base
{
public void display()
{System.out.println("Derived 1");}
}

class Derived2 extends Base
{
public void display()
{System.out.println("Derived 2");}
}