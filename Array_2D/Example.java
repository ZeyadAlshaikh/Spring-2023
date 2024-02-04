package Array_2D;

public class Example {
    public static void main(String[] args) {
        
        // 1. 
        //int[][] array = new int[2][2];
        // 2.
        // int[][] array;
        // array = new int[2][2];
        //3.
        int[][] array = {
                        {1,2},
                        {4,5,3}
                        }; 
        


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
