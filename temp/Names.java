package temp;
import java.util.Arrays;
public class Names {
    public static void main(String[] args) {
        
        String[] names = {"Khaled", "Hani", "Anas"};

        Arrays.sort(names);
        
        System.out.println(Arrays.binarySearch( names, "Muhammad"));

        System.out.println(Arrays.toString(names));

        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }
    }
}
