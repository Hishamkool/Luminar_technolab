package oops1;

class Grandfather{
    String name= "John";
    int age = 70;
    String job = "Farmer";

}

class Father extends Grandfather{
    String name1= "Jacob john";
    int age1 = 50;
    String job1 = "doctor";

}

class Son extends Father{
    String name2= "jose";
    int age2 = 14;
    int std = 9;
}


public class Main2 {
    public static void main(String[] args) {
        Son child = new Son();
        System.out.println("My name is "+child.name2);
        System.out.println("Iam  "+child.age+ "years old");
        System.out.println("Iam studying in  "+child.std+"Grade");
        System.out.println("My father's name is "+child.name1);
        System.out.println("My Fathers age is "+child.age1);
        System.out.println("My fathers job  is "+child.job1);
    }

}
