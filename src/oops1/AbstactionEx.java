package oops1;

abstract class Parent6 {
    String name;
    int age;

    abstract void show();  // abstract function

    void display() {
        System.out.println("Inside display function");

    }

}

public class AbstactionEx extends Parent6 {


    public static void main(String[] args) {
        AbstactionEx obj = new AbstactionEx();
        obj.show();
        obj.display();
    }

    @Override
    void show() {   // abstract method body defined in a non-abstract class which extends the abstract class and overrides the abstract method
        System.out.println("Inside Show function");
        System.out.println("My name is " + (name = "Hisham") + " and Iam" + (age = 23) + " years old");

    }


}
