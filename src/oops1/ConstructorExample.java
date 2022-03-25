package oops1;

public class ConstructorExample {

    ConstructorExample() {
        this(20);   // calls the constructor with parameter
        System.out.println("Inside Default constructor");


    }

    ConstructorExample(int data) {
//        this();  // calls default constructor
        System.out.println("Inside parametrized constructor data= " + data);

    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();
//        ConstructorExample obj = new ConstructorExample(20);
        obj.sum(20, 30);
    }

    void sum(int a, int b) {
        int sum = a + b;
        System.out.println(" Sum = " + sum);
    }
}
