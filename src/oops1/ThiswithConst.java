package oops1;

public class ThiswithConst {

    ThiswithConst() {
        System.out.println("default constructor");
    }

    ThiswithConst(int a) {
        this();
        System.out.println("value passed = " + a);
    }

    ThiswithConst(int a, int b) {
        this(20);
        int ss = a + b;
        System.out.println("The sum of the values =" + ss + ".");

    }

    public static void main(String[] args) {
        ThiswithConst ab = new ThiswithConst(20, 30);
    }

}
