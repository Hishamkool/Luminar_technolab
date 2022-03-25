package base;

import java.util.StringTokenizer;

public class StringTokenizassser {
    public static void main(String[] args) {
//        StringTokenizer data = new StringTokenizer( "Hello all welcome");
//
//        while (data.hasMoreTokens()){
//            System.out.println(data.nextToken());
//        }

    String data = "Welcome to ooty nice to meet you";
    String myarray[] =data.split(" ");
    for (String names : myarray){
        System.out.println(names);
    }


    }
}
