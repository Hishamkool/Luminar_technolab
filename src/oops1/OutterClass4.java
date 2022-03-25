package oops1;

interface Myinterface {
    void display();
}

abstract class MyAbstractClass {
    abstract void show();
}

//class demo1 extends MyClass {
//    @Override
//    void show() {
//        System.out.println("Abstract class");
//    }
//}

//class demo implements Myinterface {
//
//
//    @Override
//    public void display() {
//        System.out.println("Interface");
//    }
//}

public class OutterClass4 {


    public static void main(String[] args) {
//        demo obj = new demo();
//        obj.display();
//        demo1 obj1 = new demo1();
//        obj1.show();


//        Instead of using a class to override the abstract and interfaces we can just use an unknown class by creating object of abstract class and interface
        MyAbstractClass mac= new MyAbstractClass() {
            @Override
            void show() {
                System.out.println("Abstract class");
            }
        }; // use semicolon like we end an object creation

//        now we need to call this object
        mac.show();

        Myinterface mi = new Myinterface() {
            @Override
            public void display() {
                System.out.println("Interface");

            }
        };

        mi.display();


    }
}