import java.util.Stack;
public class Stack1
{
    public static void main(String[] s)
    {
        Stack<Integer> sta1 = new Stack<Integer>();

        sta1.push(11);
        sta1.push(22);
        sta1.push(33);
        sta1.push(44);

System.out.println(sta1.pop());
System.out.println(sta1.peek());
System.out.println(sta1.search(22));
System.out.println(sta1);

}}