package base;

public class MultiDiamentional_Array {
    public static void main(String[] args) {

        int numbers [][] = new int[3][3];
        int numbers1[][] = { {1,1,2},{1,4,1}};
//        numbers [0][0] =1;
//
//        numbers [1][0] =1;
//        numbers [1][2] =1;
//                                             // no need for space in between
//        numbers [2][0] =1;
//        numbers [2][1] =1;
//        numbers [2][2] =1;
     for(int row =0; row <2 ; row++){
         for(int col =0; col<3;col++){
             System.out.print(numbers1[row][col] + " ");
         }
         System.out.println();
     }
    }
}
