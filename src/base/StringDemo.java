package base;

public class StringDemo {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1==s2);
//        checking if both are same
        System.out.println(s1==s3);
//        s1 not equal to s3 cause not same memory location (s1 in heep but s3 is in heep constant pool)

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
//        returns true cause only checks case sensitivity and value not memory location


        System.out.println(s1.compareTo(s2));
//        compares the ascii vale, dependend on case


        System.out.println(s1.codePointAt(0));
//        outputs the ascii value at index 0 of string s1.




    }
}
