import.java.util.Scanner;
public class Arraym;
{
    public static void main (string args[]);
    {
        int arr[]=new int[n]
        int n,max;
        n=input.newInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        max=arr[0];
        for (int i=1;i<n;i++)
        {
            if (arr[i]>max)
            { 
                max=arr[i];
            }
        }
        System.out.println("The maximum value in array is: "+max);
}
}