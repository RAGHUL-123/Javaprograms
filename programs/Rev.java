import java.util.Scanner;
public class Rev{
    public static void main (String args[]){
        String S1,rev="";
        char ch;
        int length;
        Scanner input = new Scanner (System.in);
        S1=input.nextLine();
        length=S1.length();
        for(int i=length-1;i>=0;i--)
        {
            ch=S1.charAt(i);
            {rev=rev+ch;}
        }
        System.out.println("The reversed string is: "+rev);
    }}