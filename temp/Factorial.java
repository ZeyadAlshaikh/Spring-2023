package temp;

public class Factorial {
    public static void main(String[] args) {
        
        System.out.println(factorial(4));
        System.out.println(r_factorial(4));
        System.out.println(sum(3));
    }


    public static int factorial(int num){
        int fac = 1; 

        for (int i = num; i >0; i--) {
            fac *= i; 
        }

        return fac; 
    }


    public static int r_factorial(int num){
        System.out.println("r_factorial("+ num +")");
        //stop condition
        if( num == 0 )
            return 1; 
        
        //formula n! = n * (n-1)!
        return  num * r_factorial(num-1);
    }

    public static int r_sum(int n){
        if(n == 0 )
            return 0; 
        
        return n + sum(n-1);
    }

    public static int sum(int n){
        int sum =0 ; 
        for (int i = n; i > 0 ; i--) {
            sum += i;
        }
        return sum ; 
    }

}
