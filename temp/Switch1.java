package temp;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = in.nextInt(); 

        int num2 = 10/num;
        // boolean expression ? true experssion : false expersion 
        //    num % 2 == 0   ?  "Even"    : "Odd"
        System.out.println(num % 2 == 0 ? "Even" : "Odd");

        String oddEven = num % 2 == 0 ? "Even" : "Odd";

        System.out.println(oddEven);
        // if(num % 2 == 0)
        //     System.out.println("even");
        // else 
        //     System.out.println("Odd");

        // System.out.println("Please enter morning or evening");
        // String str = in.next();

        // switch(str){
        //     case "morning":
        //         System.out.println("Good morning");
        //         break; 
        //     case "evening":
        //         System.out.println("Good evening");
        //         break;
        //     default:
        //         System.out.println("Good bye");
        // }

        // System.out.println("Please enter your grade");
        // int grade = in.nextInt();

        // switch(grade/10){
        //     case 10:
        //     case 9:
        //         System.out.println("A");
        //         break;
        //     case 8:
        //         System.out.println("B");
        //         break;
        //     case 7:
        //         System.out.println("C");
        //         break;
        //     case 6:
        //         System.out.println("D");
        //         break;
        //     default:
        //     System.out.println("F");
        // }

        // if( grade >=90 )
        //     System.out.println("A");
        // else if ( grade >=80){
        //     System.out.println('B');
        // }else if (grade >=70)
        //     System.out.println("C");
        // else if (grade >= 60)
        //     System.out.println("D");
        // else
        //     System.out.println("F");

    }       
}
