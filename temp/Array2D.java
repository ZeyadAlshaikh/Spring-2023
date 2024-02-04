package temp;

import java.util.Scanner;

public class Array2D {
    
    public static void main(String[] args) {
        
        /*String[][] names = new String[2][3];
        
        //System.out.println(names[0][0]);
        Scanner in = new Scanner(System.in);

        for( int row = 0 ; row < names.length; row++ ){
            for(int column=0; column < names[row].length; column++){
                System.out.println("name ["+row+"]["+column+"]");
                names[row][column] = in.next();
            }
            
        }*/

        /*String[][] names = {
                            {"Ali","Alobodi"},
                            {"Basem","Mubarak", "Ba Doman"}
                            };

        for( int row = 0 ; row < names.length; row++ ){
            for(int column=0; column < names[row].length; column++){
                System.out.print(names[row][column] + " ");
            }
            System.out.println();
        }
    */
        int[][] numbers = new int[2][2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int)(Math.random()*10);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }

        int total = 0; 
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                total +=  numbers[i][j];
            }
           
        }
        System.out.println("Total = "+ total);
        
    }
}
