import java .util.Scanner;
public class NumPyramid{
public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int rows;
    rows=input.nextInt();
    for( int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
    System.out.println();
    }
}
}
