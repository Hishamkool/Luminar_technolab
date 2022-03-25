package oops1;

public class ThiswithFunction {

    void add(){
        int sum = 23+4;
        System.out.println("sum from add funtion without paramater ="+sum);

    }

    int add(int a, int b){
        int sum = a+b;
        return sum;

    }
    void show(int a, int b, int c){
        int sum = a+c+b;
        System.out.println("The sum from show function ="+sum);

        int sum1 = this.add(20,20);
        System.out.println("the value is " +sum1);
        this.add();

    }
    public static void main(String[] args) {
        ThiswithFunction tf = new ThiswithFunction();
        tf.show(1,2,3);
    }

}
