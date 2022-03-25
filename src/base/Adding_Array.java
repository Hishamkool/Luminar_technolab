package base;

public class Adding_Array {
    public static void main(String[] args) {
//        int arr1[][] = { {1,2}, {3,6}};
        int ara[] = {1, 2, 2, 2};
        int size = ara.length;
        int Sum1 =0;
        for (int i = 0; i < size; i++) {
            Sum1 = Sum1 + ara[i];
        }
        System.out.println(Sum1);
    }
}
