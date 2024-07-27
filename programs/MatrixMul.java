import java.util.Scanner;
public class MatrixMul
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];

System.out.println("Enter the first matrix");
for(int i=0;i<=1;i++)
{for(int j=0;j<=1;j++)
{a[i][j]=input.nextInt();}}

System.out.println("Enter the second matrix");
for(int i=0;i<=1;i++)
{for(int j=0;j<=1;j++)
{b[i][j]=input.nextInt();}}  
 
 for(int i=0;i<=1;i++)
{for(int j=0;j<=1;j++)
{c[i][j]=0;   

for(int k=0;k<=1;k++)      
{c[i][j]+=a[i][k]*b[k][j];}}}
for(int i=0;i<=1;i++)
{for(int j=0;j<=1;j++)

{System.out.print(c[i][j]+"  ");}
System.out.println(" ");}
}}