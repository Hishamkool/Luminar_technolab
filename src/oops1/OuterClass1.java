package oops1;

public class OuterClass1 {
    void show(){


        int c = 30;

//        local inner class as its inside a function of the class
        class LocalInner{


            int a = 20;
            int b = 30;
            void add(){
                System.out.println("sum = "+(a+b+c));
            }

        }

        LocalInner obj = new LocalInner();
        obj.add();
        //Localinner class is inside the show function of the outter class so we cannot create the obj for a localclass outside( thats from the main class).


    }

    public static void main(String[] args) {
        OuterClass1 ob1 = new OuterClass1();
        ob1.show();

    }

}
