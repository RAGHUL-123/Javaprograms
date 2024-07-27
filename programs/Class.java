public class Class
{
public static void main(String args[])
{
Cse obj1 = new Cse();

obj1.setdata();
obj1.display();
}
}

class Cse
{
int regno;
String name;

public void setdata()
{
regno=108;
name="Raghul";
}

public void display()
{
System.out.println("The Reg no is "+regno);
System.out.println("The name is "+name);
}
}