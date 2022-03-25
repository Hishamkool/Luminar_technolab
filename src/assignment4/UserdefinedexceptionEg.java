package assignment4;

import java.util.Scanner;

class UserDefExcpetion1 extends Exception {
    UserDefExcpetion1(String message) {
        super(message);
    }
}

public class UserdefinedexceptionEg {
//     String name;

    public static void main(String[] args) {
        String abc = null ;
//        System.out.println("enter string");
//        Scanner obj = new Scanner(System.in);
//        String abc =obj.next();

        try{
            fun1(abc);
        }catch (UserDefExcpetion1 a){
            a.printStackTrace();
        }
    }

    static void fun1(String name) throws UserDefExcpetion1,NullPointerException {
        if (name == null) {
            throw new UserDefExcpetion1("Null pointer / contains no data error");
        } else {
            System.out.println("Not an exception");
        }
    }
}
