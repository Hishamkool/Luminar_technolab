package base;

public class StringEx {
    public static void main(String[] args) {
        char myarray[] = {'h','e','l','l','o'};
        System.out.println(myarray);

//        string literal method
        String name1 = "Muhammed";

        String name2 = new String("Hisham");
        String name3 = name1.concat(" hisham k a");
        System.out.println("name3 ="+name3);


        StringBuilder name4 = new StringBuilder("Hari");
        name4.append("  Haran");
        System.out.println("name4 ="+name4);
        System.out.println(name4.replace(0,5,"govind"));
        System.out.println(name4.replace(0,6,"Hari"));
        System.out.println(name4.replace(5,9,"krishnan"));




    }
}
