package Array_2D;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        

        // type[] name = new type[size];
        //int[][] array = new int[5][2];
        /* int[][] array = {
                            {1,2},
                            {5,6},
                            {4,5,7,8}
                        };

        for (int i = 0; i < array.length; i++) {

            for(int j=0 ; j< array[i].length; j++)
            System.out.print(array[i][j]+" ");
            
            System.out.println();
        }

        int sum = 0; 

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("SUM = "+ sum);
*/

        String[][] names = new String[3][2];

        Scanner in  = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println("Please enter name");
                names[i][j] = in.next();
            }
        }


        for (int row = 0; row < names.length; row++) {
            for (int column = 0; column < names[row].length; column++) {
                
                System.out.print(names[row][column]+" ") ;
            }
            System.out.println();
        }

        
    }
}
