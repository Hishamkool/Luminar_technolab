package oops1;

public class OuterClass {
    String  name="hisham";
    int age=23;

    class InnerClass{ //instance innerclass
        String job ="Student";

        void display(){
            String job = "Student";
            System.out.println("My name is "+name+"age="+age+" And im a "+job);
        }

    }

    void show(){
        System.out.println("Inside show function of outer class ");

    }
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.show();
        // now to call a class inside outer class we need to create an object for inner class, we CAN NOT directly access obj.inner().
        OuterClass.InnerClass innerclassobj = obj. new InnerClass(); // outer class object . new inner class constructor
        innerclassobj.display();
    }
}
