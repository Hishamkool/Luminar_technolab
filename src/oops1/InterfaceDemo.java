package oops1;

interface Parent8 {
    String name = "Seenu";
    int age = 21;

    void display();

    //by default all methods are abstract , also all variables are final
    void show();
}

public class InterfaceDemo implements Parent8 {
    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.display();
    }

    @Override
    public void display() {
        System.out.println("Mu name " + name);
        this.show();
    }

    @Override
    public void show() {
        System.out.println("Iam " + age + " yrs old \nand cannot update the variable age or name as it is final variables inside interface");
    }

}

