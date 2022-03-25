package oops1;

import java.awt.*;

class Parent1 {
    void sum() {
        int sum = 20 + 24;
        System.out.println("sum=" + sum);

    }
}


public class MethodOverriding extends Parent1 {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        p1.sum();
    }
}
