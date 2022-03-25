package base;

import java.util.Scanner;

public class Mul_Array_Using_Scanner {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter rows");
        int row = obj.nextInt();

        System.out.println("Enter Columns:");

        int col = obj.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter the "+(row+col)+" values");
        for (int r=0;r<row;r++){
            for (int c =0; c< col; c++){
            arr[r][c]= obj.nextInt();
            }
        }
        System.out.println("The matrix is :");
        for (int r=0; r<row ;r++){
            for (int c =0; c< col; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }

    }
}
