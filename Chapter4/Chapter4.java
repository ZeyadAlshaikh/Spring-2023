package Chapter4;

import java.util.Scanner;

public class Chapter4 {
    public static void main(String[] args) {

        String str = """
            Hello 
                 \tJava %d
                    programmmers
                """.formatted(101);

        System.out.println(str);

        //System.out.printf(format,args);
        //System.out.printf("%d %.2f %s %b %n", 12, 34.21,true ,"hello");
        // System.out.printf("%.2f", 13.465464);

        // Scanner in = new Scanner(System.in);
        // System.out.println("Please enter your name");
        // String name = in.nextLine(); 
        // //char initial = in.next().charAt(0);
        // System.out.println(name.endsWith("ed"));

        // String str = "Welcome to collage of Heros!";
        // System.out.println(str.substring(11,18));
        // System.out.println(str.indexOf("x",10));


    //    double GPA = Double.parseDouble("4.5");
    //    int num = Integer.parseInt("10");
    //     System.out.println(++num);

        // String str1 = new String("  Hello world   ");
        // String str2 = new String("Hello world");

        // if( str1.equals(str2)  )
        //     System.out.println("equal");
        // else
        //     System.out.println("not equal");


        // System.out.println(str1.length());
        // System.out.println(str1.charAt(10));
        // String str3 = "Hello ";
        // String str4 = str3 + str2;
        // System.out.println(str4);
        // System.out.println(str1.trim());


        // System.out.println(Character.isDigit('9'));
        // System.out.println(Character.isLetterOrDigit('?'));

        // char a = '\u0041';
        // System.out.println(++a);

        // System.out.println("Hello\" \fJava \fprogrammers\\");

        // a= 'W';
        
        // if(a >= 'A' && a <= 'Z')
        //  System.out.println("[A-Z]");


        /* Math class */
        // System.out.println(Math.exp(1));
        // System.out.println(Math.max(10, 9));
        // System.out.println(50 + (int)(Math.random()*10));

       
    }
}
