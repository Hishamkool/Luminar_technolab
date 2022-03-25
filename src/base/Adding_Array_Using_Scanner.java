package base;

import java.util.Scanner;

// SUM OF AN 1D ARRAY USING SCANNER

public class Adding_Array_Using_Scanner {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner obj = new Scanner(System.in);
        int len = obj.nextInt();
//        System.out.print(row);
        int arr1[] = new int[len];
//        datatype arr_name[] = new arr_name[];
        System.out.println("Enter values");
        int sum =0;
        for (int i=0; i<len; i++){
            arr1[i]= obj.nextInt();
            sum = sum + arr1[i];
        }
        System.out.println(sum);
//        Accepting array

//      calculating sum
//        int sum =0;
//        for (int i =0 ; i< len; i++){
//            sum = sum + arr1[i];
//        }
//        System.out.println(sum);

/*The sum of all natural numbers 1 to 100 can be calculated
using the formula, S= n/2[2a + (n − 1) × d], where n is the total
 number of natural numbers from 1 to 100, d is the difference between
  the two consecutive terms, and a is the first term. There are a total of 100
  natural numbers, so n = 100.*/
    }
}
