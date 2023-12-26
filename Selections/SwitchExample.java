package Selections;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.println("Please enter a number");        
        int number = 10; 
        
        // String evenOdd ; 
        // if(number % 2 == 0 )
        //     evenOdd = "Even";
        // else    
        //     evenOdd = "Odd";

        //expression ? true : false
        System.out.println((number % 2 == 0) ? "Even" : "Odd");

        // System.out.println("Please enter the day number");
        // int day = in.nextInt(); 
         int day = 10; 
        switch(day){
            case 1:
                System.out.println("Saturday");
                break; 
            case 2: 
                System.out.println("Sunday");
                break;
            case 3 : 
                System.out.println("Monday");
                break;
            case 4: 
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Unknown day");

        }
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
        //         System.out.println("Go to bed");
        // }

        //System.out.println("Please enter your grade");
        // int grade = in.nextInt(); 

        // switch(grade/10){
        //     case 10:
        //     case 9:
        //         System.out.println('A');
        //         break;
        //     case 8: 
        //         System.out.println('B');
        //         break;
        //     case 7:
        //         System.out.println('C');
        //         break;
        //     case 6:
        //         System.out.println('D');
        //         break;
        //     default:
        //         System.out.println('F');
        // }
        // if( grade >= 90 )
        //     System.out.println('A');
        // else if (grade >= 80)
        //     System.out.println("B");
        // else if (grade >= 70)
        //     System.out.println('C');
        // else if(grade >= 60)
        //     System.out.println("D");
        // else
        //     System.out.println("F");
        

    }
}
