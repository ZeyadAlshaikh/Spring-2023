package Quiz;

public class LoopQuiz {
    public static void main(String[] args) {
        int i = 1 ;
        while(i <= 5){
            System.out.println(i);
            i++;
        } 

        for(int j=2; j<=16; j*=2){
            System.out.println("j= " +j);
        }


        for(int j=1 ; j<10; j++){
            if(j % 2 == 0){
                System.out.println(j);
            }
        }

        int x =0; 
        do{
            System.out.println(x);
        }while(x!=0);
    }
}
