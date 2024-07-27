import java.util.HashSet;
import java.util.Set;
public class Set2{
    public static void main(String arg[]){
    Set<Integer>set1=new HashSet<Integer>();
    Set<Integer>set2=new HashSet<Integer>();
    Set<Integer>set3=new HashSet<Integer>();

    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(70);
    System.out.println("Set1"+set1);
   
    set2.add(10);
    set2.add(20);
    set2.add(30);
    set2.add(40);
    System.out.println("Set2"+set2);

    set3.add(10);
    set3.add(20);
    set3.add(30);
    System.out.println("Set3"+set3);

    //union operation
    set1.addAll(set2);
    System.out.println("The union of set1 and set2 : "+set1);

    //intersection 
    set3.retainAll(set1);
    System.out.println("The intersection of set1 and set2: "+set3);

    //difference

    set1.removeAll(set2);
    System.out.println("The difference of set1 and set2 is: "+set1);
    }

}