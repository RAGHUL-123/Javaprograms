public class Class2
{
public static void main(String args[])
{
Cse obj1 = new Cse();

obj1.display();

Cse obj2 = new Cse(106,"GOKUL");

obj2.display();

Cse obj3 = new Cse(obj1);
        

obj3.display();

}
}

class Cse
{
int regno;
String name;

public Cse()
{
regno=108;
name="Babu";
}

public Cse(int register, String student)
{
regno = register;
name = student;
}

public Cse(Cse obj3) 
{
regno = obj3.regno;
name = obj3.name;
}

public void display()
{
System.out.println(regno);
System.out.println(name);
System.out.println("");

}
}