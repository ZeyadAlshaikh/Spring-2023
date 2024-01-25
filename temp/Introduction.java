package temp;

public class Introduction {
    public static void sayHi(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {

       int x = 10 , y =20; 
       System.out.printf("x%d y%d %n ", x, y);
       System.out.println(sum(x, y));
       System.out.printf("x%d y%d %n ", x, y);
       System.out.println(sum(x, 20.5));
       
       //printSum(10,30 );
        
    }

     

    
    
    public static int sum(int x, int y){
        System.out.println("Int sum");
        int sum = x + y; 
        x = 0; 
        y=0;
        return sum;
    }

    public static int sum(double a, int b){
        System.out.println("double and int sum");
        int sum = (int)a + b; 
        return sum;
    }

    public static int sum(int a, double b){
        System.out.println("int and double sum");
        int sum = a + (int)b; 
        return sum;
    }

    public static int sum(double a, double b){
        System.out.println("double sum");
        double sum = a + b; 
        return (int)sum;
    }

    public static void printSum(int a, int b ){
        System.out.println(a+b);
    }
}
