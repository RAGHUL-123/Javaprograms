public class CompilePo
{
public static void main(String args[])
{
Add obj1 = new Add();
obj1.setdata();
obj1.addition();
obj1.addition(5);
obj1.addition(5,6);
}
}

class Add
{
int i;

public void setdata()
{i=10;}

public void addition()
{System.out.println(i);}

public void addition(int x)
{System.out.println(i+x);}

public void addition(int x, int y)
{System.out.println(i+x+y);}
}