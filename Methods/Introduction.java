package Methods;

public class Introduction {

    static int x = 100; 
    public static void main(String[] args) {
        double y = 10.2 ; 
        double z = 200; 

        System.out.println(Math.max(x, Math.max(y, z)));

        // System.out.println(sum(x, y));
        // System.out.println(x);
        //System.out.println(sum(10.2, 30));
        //methodA();
        
        System.out.println(max(1, 10));
    }


    public static double max(int num1 , double num2){
        if( num1> num2)
            return num1;
        else
            return num2;
    }

    // public static double max(double num1 , int num2){
    //     if( num1> num2)
    //         return num1;
    //     else
    //         return num2;
    // }

    public static double sum(int n1, double n2){
        System.out.println("Int sum");
        double sum = n1 + n2 ; 
        n1 = 0; 
        return sum; 
    }
   

    public static double sum(double n1, int n2 ){
        System.out.println("Double sum");
        return n1 + n2 + x; 
    }


    public static void methodA(){
        int x=10 , y =5;   
        methodB(); 
        System.out.println("Method A");

    }

    public static void methodB(){
        int x=10 , y =5;   
        methodC(); 
        System.out.println("Method B");
    }

    public static void methodC(){
        int x=10 , y =5;    
        System.out.println("Method C");
    }

}
