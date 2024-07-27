import java.util.Scanner;
public class Armstrong {
public static void main(String args[]){
    int a,n,tot=0;
    Scanner input = new Scanner (System.in);
    n=input.nextInt();
    a=n;
    while (n>0)
    {
        int remainder =n%10;
        tot=tot+(remainder*remainder*remainder);
        n=n/10;
    }
    if (a==tot)
    {
        System.out.println("it is armstrong");
    }
    else {
        System.out.println("it's not a armstrong number");
    }

}}