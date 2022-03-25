package oops1;

public class OuterClass2 {
    static int age = 22;
    String name = "ji";

    static class inner {
        void show() {
//            System.out.println("My name is " + name); // CAN NOT acces non static variables of the outter class inside the stactic inner class
            // to access it we need to declare it as a static variable
            System.out.println("My age  is " + age);
            //can acess age as its a static variable
        }
    }

    public static void main(String[] args) {
        inner obj2 = new inner();
        obj2.show();
    }

}
