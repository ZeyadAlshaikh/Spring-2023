package Loops;

public class Introduction {
    public static void main(String[] args) {
        
        // print numbers from 1 to 10 
        int i = 0; 
        System.out.println("Print by while");
        while( i<=10){
            System.out.println(i);
            i++;
        }
        i = 0; 
        System.out.println("Print by do while");
        do{
            System.out.println(i);
            i++;
        }while( i<=10);


        System.out.println("Print by for loop ");
        for( i=10; i >= 0 ; i--){
            System.out.println(i);


        } 



    }
}
