package assignment3;

interface parent1 {
    String name = "Ravi";
    int age = 24;
    String job = "Engineer";
}

interface parent2 {
    String name = "Reeta";
    int age = 22;
    String job = "Doctor";
}

class Child1 implements parent1,parent2{
    void details3() {
        System.out.println("Name= Sangeet");
        System.out.println("Age= 15");
        System.out.println("Class = 9 ");
    }
}

class Child2 extends Child1{
    void details4() {
        System.out.println("Name= Sumesh");
        System.out.println("Age= 7");
        System.out.println("Class = 2");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
            Child2 c2 = new Child2();
        System.out.println();
        System.out.println("Child 1 details: ");
        c2.details3();
        System.out.println("---------------------------------");
        System.out.println("Child 2 details: ");
            c2.details4();
        System.out.println("---------------------------------");
        System.out.println("Parents details :");
        System.out.println("Fathers,\n name ="+parent1.name+"\n Age = "+parent1.age+"\n Job= "+parent1.job);
        System.out.println("---------------------------------");
        System.out.println("Mothers,\n name ="+parent2.name+"\n Age = "+parent2.age+"\n Job= "+parent2.job);
        System.out.println("---------------------------------");
    }
}
