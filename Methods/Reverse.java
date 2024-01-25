package Methods;

public class Reverse {

    public static void reverseString(String str){
        // hello
        //olleh
        //['h','e','l','l','o']
        //[ 0, 1 , 2 , 3 , 4]
        // str.lenght()-1 = 4
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        } 

        System.out.println();
    }


    public static String reverseString(String str, int lenght){
    
        String newStr = "";
        for (int i = lenght-1; i >= 0; i--) {
            newStr += str.charAt(i);
        } 
        return newStr;
    }


    public static void main(String[] args) {
        
        String str = "Muhammad";
        System.out.println("Original String:" + str);
        System.out.print("reverse String: ");
        //reverseString(str);
        System.out.println(reverseString(str, str.length()));
    }
}
