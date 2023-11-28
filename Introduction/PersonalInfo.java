import java.util.Scanner;

public class PersonalInfo {
    
    public static void main(String[] args){

       Scanner in = new Scanner(System.in);

       String  name; 
       int age;


        System.out.println("Please enter your name");
        name = in.nextLine(); 

        System.out.println("Please enter your age");
        age = in.nextInt();

        System.out.println("Hello Mr. "+ name +" Your age is : "+ age);


    }
}
