package temp;

import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
        
        // 1 
        //int[] intArray = new int[5];

        // 2 
        //int[] intArray ={0, 10, 12, 6, 7, 0, 4};
        
        //3 
        int[] intArray ;
        intArray = new int[5];

        char[] chars = new char[3];
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(intArray));
        // assign individual  values to array
            // intArray[0] = 5 ;
            // intArray[1] = 4 ;
            // intArray[2] = 3 ;
            // intArray[3] = 2 ;
            // intArray[4] = 1 ;
        //ArrayIndexOutOfBoundsException
        //intArray[5] = 5 ;

        for(int i = 0; i<intArray.length ; i++)
        {
            intArray[i] = i * 2;
        }

        for(int i = 0; i<intArray.length ; i++)
        {
           System.out.println( intArray[i]) ; 
        }

        // System.out.println(intArray[0]);
        // System.out.println(intArray[1]);
        // System.out.println(intArray[2]);
        // System.out.println(intArray[3]);
        // System.out.println(intArray[4]);


    }
}
