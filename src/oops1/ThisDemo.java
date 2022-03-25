package oops1;

public class ThisDemo<name> {

    String name;
    int age;
    String job;

    ThisDemo(String n, int c) {
        name = n;
        age = c;


    }
    void job(String job){
        this.job = job; // Since both the argument and the variable has the same name we need to assign this keyword
    }
    void show(){
        System.out.println("My name is "+name+" Iam "+age+" years old, and Iam an "+job+".");
    }


    public static void main(String[] args) {
        ThisDemo demo = new ThisDemo("hisham",23);
        demo.job("Engineer");
        demo.show();
    }




}
