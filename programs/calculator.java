import java.util.Scanner;
public class calculator{
public static void main(String args[]){
    double num1,num2;
    Scanner input = new Scanner(System.in);

    System.out.print("enter the first number: ");
     num1= input.nextDouble();

    System.out.print("enter the Second number: ");
     num2= input.nextDouble();

     System.out.println("/n select the option");
     System.out.println("1.Addition");
     System.out.println("2.Subtract");
     System.out.println("3.Mulitiplication");
     System.out.println("4.Divide");

     int choice=input.nextInt();

     switch(choice){
        case 1:
        System.out.println("Answer"+(num1+num2));
        break;

        case 2:
        System.out.println("Answer"+(num1-num2));
        break;

        case 3:
        System.out.println("Answer"+(num1*num2));
        break;
        
        case 4:
        if ( num2!=0);
        {
            System.out.println("Answer"+(num1/num2));
        }
        else 
        {
            System.out.printlnSystem.out.println("Error: Cannot divide by zero");
        }
        break;
    default:
        System.out.println("Invalid choice. Please select a valid operation (1/2/3/4).");
}
}
}
