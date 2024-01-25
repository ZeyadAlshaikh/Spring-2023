package temp;

public class CallStack {
    public static void main(String[] args) {
        int w = 9; 
        System.out.println("Main method");
        methodA();
        
    }

    public static void methodA(){
        int x =10; 
        methodB();
        System.out.println("MehtodA");
    }

    public static void methodB(){
        int y = 1; 
        methodC();
        System.out.println("MehtodC");
    }

    public static void methodC(){
        int z = -1; 
        System.out.println("MehtodC");
    }
}
