import java.util.*;

public class Calculator 
{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int subtract(int a,int b)
    {
        return a-b;
    }
    public static int product(int a,int b)
    {
        return a*b;
    }
    public static int division(int a,int b)
    {
        return a/b;
    }
    public static int remainder(int a,int b)
    {
        return a%b;
    }

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        int choice;
        while(true)
        {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
        
        choice = sc.nextInt();
        

            System.out.print("Enter first number: ");
            int n1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int n2 = sc.nextInt();

        switch(choice)
            {
                case 1:
                int sum=add(n1,n2);
                System.out.println("The addition is "+sum);
                break;
                case 2:
                int diff=subtract(n1,n2);
                System.out.println("The subtraction is "+diff);
                break;
                case 3:
                int prod=product(n1,n2);
                System.out.println("The product is "+prod);
                break;
                case 4:
                if(n2==0)
                {
                    System.out.println("Division by zero is not possible");
                }
                else
                {
                     int quo=division(n1,n2);
                    System.out.println("The quotient is "+quo);
                }
                break;
                case 5:
                if(n2==0)
                {
                    System.out.println("Division by zero is not possible");
                }
                else
                {
                    int rem=remainder(n1,n2);
                    System.out.println("The remainder is "+rem);
                }
                break;
                default:
                System.out.println("Wrong option...");
                break;
            }
    }
}
}
    

