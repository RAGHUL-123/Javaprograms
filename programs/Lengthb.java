import java.util.Scanner;
public class Lengthb{
    public static void main (String args[]){
        String S1,S2;
        Scanner input = new Scanner (System.in);
        S1=input.nextLine();
        S2=input.nextLine();
        int b=S1.compareTo(S2);
        System.out.println("The length of the string1 is:  "+S1.length());
        System.out.println("The length of the string2 is:  "+S2.length());

    if (b==0){
        System.out.println("the string S1 and S2 are equal");
    }
    else if (b>0){
        System.out.println("The string s1 is greater");
    }
    else if (b<0){
        System.out.println("The string s2 is greater");
    }
    } 
}