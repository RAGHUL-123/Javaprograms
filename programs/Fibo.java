import java.util.Scanner;
public class Fibo {
public static void main(String args[]){
    int f1=0,f2=1,f3,n;
    Scanner input = new Scanner (System.in);
    n=input.nextInt();
    System.out.println(f1+" ");
    System.out.println( f2+" ");
    for (int i =2;i<n;i++)
    {{f3=f1+f2;
        f1=f2;
        f2=f3;}
    System.out.println(f3+" ");
    }}}
    
    
