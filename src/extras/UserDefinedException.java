package extras;

import java.util.Scanner;

class MyException extends Exception { //Exception is predefined class
    MyException(String s) {
        super(s);
    }
}

public class UserDefinedException {

    static void check(int age) throws MyException ,ArithmeticException  { //for user defined function to be detected use throws

        if(age <= 0){
            throw new MyException("you don't exist");
        }
        if(age <18){
            throw new MyException("Age is not valid for vote");
        }
        else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("ENter age");
            Scanner obj = new Scanner(System.in);
            int age = obj.nextInt();


            check(age);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
