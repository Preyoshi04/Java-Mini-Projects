import java.util.*;
public class Temp_Conversion {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("\t---- TEMPERATURE CONVERSION TOOL ----");
    int choice;
    do
    {
    System.out.println();
    System.out.println("1-> Celsius to Fahrenheit");
    System.out.println("2-> Fahrenheit to Celsius");
    System.out.println("3-> EXIT");
    System.out.print("\tEnter your choice: ");
    choice=sc.nextInt();

    //menu driven
    switch(choice)
    {
        case 1:
        System.out.println();
        System.out.println("\t---- CELSIUS TO FAHRENHEIT ----");
        System.out.println();
        System.out.print("\tEnter temperature in Celsius: ");
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 9/5)+32;
        System.out.println();
        System.out.println(celsius+" degrees in Celsius is equals to "+fahrenheit+" degrees in Fahrenheit");
        System.out.println("-----------------------------------------------");
        break;

        case 2:
        System.out.println();
        System.out.println("\t---- FAHRENHEIT TO CELSIUS ----");
        System.out.println();
        System.out.print("\tEnter temperature in Fahrenheit: ");
        float fah = sc.nextFloat();
        float cel = (fah - 32)*5/9;
        System.out.println(fah+" degrees in Fahrenheit is equals to "+cel+" degrees in Celsius");
        System.out.println("-----------------------------------------------");
        break;

        case 3:
        System.out.println("\t---- EXITING ---- ");
        break;

        default:
        System.out.println("\t-- WRONG INPUT --");
    }
    }while(choice!=3);
   
  }  
}
