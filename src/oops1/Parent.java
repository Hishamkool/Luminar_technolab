package oops1;

public class Parent {

    String parent = "Father";
    String name1 = "paul";
    int age1 =40;
    String job = "Engineer";

}

class Child1 extends Parent{            //single inheritence
    String name = "Anu";
    int age = 12;
    int std = 6;

}


class Child2 extends Parent{            //now m inheritence
    String name2 = "Chinnu";
    int age2 = 8;
    int std2 = 4;

}



class Main{
    public static void main(String[] args) {
        Child1 daughter = new Child1();
        System.out.println("daughters name=            "+daughter.name);
        System.out.println("Child age=              "+daughter.age);

        System.out.println("Child's Father         "+daughter.name1);
        System.out.println("Childs Fathres age     "+daughter.age1);  //inherited data

        System.out.println("----------------------------------");
        Child2 son = new Child2();
        System.out.println("SOn name=            "+son.name2);
        System.out.println("Child age              "+son.age2);
    }
}