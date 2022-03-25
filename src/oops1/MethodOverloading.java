package oops1;

public class MethodOverloading {       // method overloading (compile time polymorphism)

// Same method name different parameter length or different data type

    void add(){      // default function
        int sum =10+20;
        System.out.println("sum ="+sum);
    }

    void add(int a, int b){ // same function name with parameters
        int sum =a+b;
        System.out.println("sum2 ="+sum);

    }

    void add(String name, int age){ //same function with different parameters
        System.out.println("My name is "+name+" and Im "+age+ " years old");
    }

    public static void main(String[] args) {
        MethodOverloading overload = new MethodOverloading();
        overload.add(20,10);
        overload.add("Hisham",23);
        overload.add();

    }


}
