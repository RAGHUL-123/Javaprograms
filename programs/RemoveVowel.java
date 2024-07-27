import java.util.Scanner;
public class RemoveVowel{
    public static void main (String args[]){
        String S1,S2;
        S2=" ";
        char ch;
        String Vowl=("aeiou A E I O U");
        int length;

        Scanner input = new Scanner (System.in);
        S1=input.nextLine();
        length =S1.length();
        for(int i=0;i<=length-1;i++)
        {
            ch=S1.charAt(i);
            if (Vowl.indexOf (ch)==-1)
            {S2=S2+ch;}
        
        }
        System.out.println("The consonants are : "+S2);
    }}