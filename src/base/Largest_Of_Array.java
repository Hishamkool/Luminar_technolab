package base;

public class Largest_Of_Array {

    public static void main(String arg[]) {
        int arr[] = {99,26,35,75,77,444,4,1,9,45,88,24,100};
//        int size = arr.length;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}