abstract class A2
{
    abstract void display();
}
class B extends  A2
{
    String name="Raghul";
    void display()
    {
        System.out.println("class B: "+name);
    }
}
class C extends A2{
    int age=20;
    void display()
    {
        System.out.println("class c:  "+age);
    }
}
public class Abstract 
{
    public static void main(String args[]){
        A2 obj=new B();
        obj.display();
        obj =new C();
        obj.display();
    }
    }
