import java.util.ArrayList;
import java.util.Collections; 
public class Array1
{
public static void main(String args[])
{
ArrayList<Integer> arr1 = new ArrayList<Integer>(5);
ArrayList<Integer> arr2 = new ArrayList<Integer>(5);

for(int i=5;i>=1;i--)
{
arr1.add(i);
arr2.add(i+5);
}
arr1.add(1,33);
System.out.println(arr1);
arr1.set(1,66);
System.out.println(arr1);
arr1.remove(1);
System.out.println(arr1);
Collections.sort(arr1);
System.out.println("Sorted arr1: " + arr1);
}
}