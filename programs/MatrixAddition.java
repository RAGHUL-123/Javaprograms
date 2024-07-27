import java.util.Scanner;
public class MatrixAddition
{
    public static void main(String args[])
    {Scanner input=new Scanner(System.in);
     int a[][]=new int[2][2];
     int b[][]=new int[2][2];
     int c[][]=new int[2][2];
     int i,j;

     System.out.println("Enter the first matrix: ");
     for(i=0;i<=1;i++)
     {
       for(j=0;j<=1;j++)
       {
        a[i][j]=input.nextInt();
       }
     }

    System.out.println("Enter the Second matrix: ");
    for (i=0;i<=1;i++){
        for(j=0;j<=1;++j)
        {
            b[i][j]=input.nextInt();
        }
    }

    for(i=0;i<=1;++i){
        for(j=0;j<=1;++j){
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(""+c[i][j]);
            System.out.print(" ");
        }
        System.out.println("");
    }
    }}