import java.util.*;

public class Linked1 
{
public static void main(String[] args) 
{
LinkedList<Integer> list1 = new LinkedList<Integer>();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
list1.addFirst(0);
list1.addLast(50);

Iterator<Integer> itr1 = list1.iterator();
while (itr1.hasNext()) 
{
System.out.println(itr1.next());
}

Iterator<Integer> itr2 = list1.descendingIterator();
while (itr2.hasNext()) 
{
System.out.println(itr2.next());
}
System.out.println(list1.get(0));
System.out.println(list1.get(1));
}
}