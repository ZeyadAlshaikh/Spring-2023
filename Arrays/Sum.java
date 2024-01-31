package Arrays;

import java.util.Arrays;

public class Sum {
    
    public static void main(String args[]) {
        int[] numbers = new int[10];
        int total = 0; 
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10) ;
            total +=  numbers[i];
        }

        int avg = total / numbers.length;

        System.out.println(Arrays.toString(numbers));

        System.out.println("Average = "+ avg);

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > avg)
            System.out.println(numbers[i]);
        }

        
    }
}
