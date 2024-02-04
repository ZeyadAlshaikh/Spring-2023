package Recursion;

public class Factorial {
    
    public static void main(String[] args) {
        
        System.out.println(factorial(3));
        System.out.println(recursionFactorial(3));
    }

    public static int factorial(int num){
        int result = 1;
        for(int i = 1; i<=num; i++){
            result *= i; 
        }
        return result ; 
    }

    public static int recursionFactorial(int num){
        if(num == 1 || num == 0)
            return 1; 
        
        return num * recursionFactorial(num-1) ; 
    }
}
