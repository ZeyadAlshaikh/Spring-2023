package Arrays;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        
        int[] intArray = {4,9,0,10,100,2};
        int largest = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i]> largest)
            largest = intArray[i];
        }

        System.out.println("Largest Element is " + largest);

        int[] disArray = {4,9,0,10,100,2};
        System.arraycopy(intArray,0 , disArray, 0 , intArray.length);

       System.out.println( Arrays.binarySearch(disArray, 7));
    }

    
    
}
