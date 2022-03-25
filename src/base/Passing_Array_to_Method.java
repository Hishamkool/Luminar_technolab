package base;

public class Passing_Array_to_Method {
    int add(int x[]){
        int sum = x[0]+x[2]+x[3]+x[4]+x[1];
        return sum;

    }

    public static void main(String[] args) {
        Passing_Array_to_Method obj = new Passing_Array_to_Method();
//        to pass parameters we need to create object of class
//        int sum2=obj.add(20,30);
//        System.out.println(sum2);
            int a[] = {1,2,3,4,5};
            int sum= obj.add(a);
            System.out.println(sum);
    }
}
