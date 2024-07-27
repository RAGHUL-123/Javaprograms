import java.util.Scanner;
public class Spc{
    public static void main (String args[]){
        String S1,S2;
        S2="";
        char ch;int count=0;int length;
        Scanner input = new Scanner (System.in);
        S1=input.nextLine();
        length =S1.length();
        for(int i=0;i<=length-1;i++)
        {
            ch=S1.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                S2=S2+ch;
            count=count++;}

        }
        System.out.println("The special characters are : "+S2.length());
    }}