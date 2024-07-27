import java.util.Scanner;
public class Arraym
{
    public static void main(String args[])
    {
        int n,max,min;
        Scanner input = new Scanner (System.in);
        n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        max=arr[0];
        min=arr[0];
        for (int i=1;i<n;i++)
        {
            if (arr[i]>max)
            { 
                max=arr[i];
            }
            else if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The maximum value in array is: "+max);
        System.out.println("The minimum value in array is: "+min);
}
}