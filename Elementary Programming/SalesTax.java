import java.util.Scanner;

public class SalesTax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    

    System.out.print("Enter purchase amount: ");
    double purchaseAmount = input.nextDouble();
    
    double tax = purchaseAmount * 0.06;
    System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);

    System.out.printf( "Sales tax is %.4f \n",  (int)(tax * 100) / 100.0 );


    // this part shows how to get the max value of any type
    System.out.println(Integer.MAX_VALUE);
    int x = Integer.MAX_VALUE; 
    System.out.println(x);
    x = x * 2 ;
    System.out.println(x);

    

  }
}