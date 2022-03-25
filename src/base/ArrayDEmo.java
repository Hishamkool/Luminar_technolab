package base;

public class ArrayDEmo {
    public static void main(String[] args) {
        /*dont name class array cause its built in class
    datatype arrayname[] = new datatype[arraysize];
     */
        int ids[] = new int[10];
        ids[0] = 1;
        ids[1] = 2;
        ids[2] = 22;
        ids[3] = 24;
        ids[4] = 234;
        ids[5] = 2556;
        ids[9] = 26677;

        for(int index = 0; index <10; index++){
            System.out.println(ids[index]);
        }

    }


}
