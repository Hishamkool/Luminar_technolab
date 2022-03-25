package base;

import java.util.Scanner;

public class ArrayUsing_Scanner {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter students count");
        int count = obj.nextInt();


        String names[] = new String[count];
        System.out.println("Enter students name");
        for (int i =0 ; i < count ; i++){
            names[i] = obj.next();
        }
        System.out.println("The names are: ");
        for (int i =0 ; i < count ; i++){
            System.out.println(names[i]+" ");

        }

    }
}
